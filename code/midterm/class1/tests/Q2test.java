
class SlidePuzzleBoardAnswer
{ private int size;   //  the board's size
  private PuzzlePiece[][] board; // the array that holds the pieces

  private int empty_row;  
  private int empty_col;

  public SlidePuzzleBoardAnswer(int s)
  { size = s;
    board = new PuzzlePiece[size][size];
    for ( int num = 0;  num != size * size;  num = num + 1 )
        { PuzzlePiece p = new PuzzlePiece(num); 
          int row = num / size;
          int col = num % size;
          board[row][col] = p;
        }
    empty_row = 0;
    empty_col = 0;
  }
  public int computePossiblePieces(int distance) {
	  int result = 0; 
	  for ( int num = 1;  num != size * size;  num = num + 1 ) {
		  int row = num / size;
          int col = num % size;
          if ((row + col) <= distance && ((distance - (row + col)) % 2 == 0)) {
        	  result++;
          }
	  }
	  return result;
  }
}

public class Q2test {
    public void test(int size, int dist) {
        SlidePuzzleBoard b1 = new SlidePuzzleBoard(size);
        SlidePuzzleBoardAnswer b1_answer = new SlidePuzzleBoardAnswer(size);
    	assertTrue(b1.computePossiblePieces(dist) == b1_answer.computePossiblePieces(dist));
    }
    @Test(timeout=5000)
    public void test1() {
        test(4, 2);
    }

    @Test(timeout=5000)
    public void test2() {
    	test(4, 4);
    }
    @Test(timeout=5000)
    public void test3() {
    	test(10, 4);
    }
    @Test(timeout=5000)
    public void test4() {
    	test(5, 10);
    }
    @Test(timeout=5000)
    public void test5() {
    	test(9, 5);
    }
}
