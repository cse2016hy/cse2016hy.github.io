
class SlidePuzzleBoardAnswer { 
  private int size;   //  the board's size
  private PuzzlePiece[][] board; // the array that holds the pieces

  // one position on the board must be an empty space:
  private int empty_row;  
  private int empty_col;
     // representation invariant:  board[empty_row][empty_col] == null

  public SlidePuzzleBoardAnswer(int s)
  { size = s;
    board = new PuzzlePiece[size][size];
    // create the individual pieces and place on the board in reverse order:
    for ( int num = 0;  num != size * size;  num = num + 1 )
        { PuzzlePiece p = new PuzzlePiece(num); 
          int row = num / size;
          int col = num % size;
          // set  p  in a ``reversed position'' on the board:
          board[row][col] = p;
        }
    // remember the location on the board where initially there is no piece:
    empty_row = 0;
    empty_col = 0;
  }
  private static int binomialCoeff(int n, int k) 
  { 
    // Base Cases 
    if (k==0 || k==n) 
      return 1; 
    
    // Recur 
    return  binomialCoeff(n-1, k-1) + binomialCoeff(n-1, k); 
  } 
  
  public int computePossibleWays(int w) {
    int[][] n_shortest = new int[size][size];
    n_shortest[0][0] = 1;
    int target_row = 0, target_col = 0; 
    
    for ( int num = 1;  num != size * size;  num = num + 1 ) {
      int row = num / size;
          int col = num % size;
      if (board[row][col].valueOf() == w) {
        target_row = row;
        target_col = col;
      }
    }
    return binomialCoeff(target_row + target_col, target_row);
  }
}

public class Q3test {
    @Test(timeout=5000)
    public void test1() {
        int size = 4;
        int target = 15;
        SlidePuzzleBoard b1 = new SlidePuzzleBoard(size);
        SlidePuzzleBoardAnswer b1_answer = new SlidePuzzleBoardAnswer(size);
      assertTrue(b1.computePossibleWays(target) == b1_answer.computePossibleWays(target));
    }
    @Test(timeout=5000)
    public void test2() {
        int size = 4;
        int target = 13;
        SlidePuzzleBoard b1 = new SlidePuzzleBoard(size);
        SlidePuzzleBoardAnswer b1_answer = new SlidePuzzleBoardAnswer(size);
      assertTrue(b1.computePossibleWays(target) == b1_answer.computePossibleWays(target));
    }
    @Test(timeout=5000)
    public void test3() {
        int size = 6;
        int target = 9;
        SlidePuzzleBoard b1 = new SlidePuzzleBoard(size);
        SlidePuzzleBoardAnswer b1_answer = new SlidePuzzleBoardAnswer(size);
      assertTrue(b1.computePossibleWays(target) == b1_answer.computePossibleWays(target));
    }
    @Test(timeout=5000)
    public void test4() {
        int size = 6;
        int target = 17;
        SlidePuzzleBoard b1 = new SlidePuzzleBoard(size);
        SlidePuzzleBoardAnswer b1_answer = new SlidePuzzleBoardAnswer(size);
      assertTrue(b1.computePossibleWays(target) == b1_answer.computePossibleWays(target));
    }
    @Test(timeout=5000)
    public void test5() {
        int size = 6;
        int target = 34;
        SlidePuzzleBoard b1 = new SlidePuzzleBoard(size);
        SlidePuzzleBoardAnswer b1_answer = new SlidePuzzleBoardAnswer(size);
      assertTrue(b1.computePossibleWays(target) == b1_answer.computePossibleWays(target));
    }
}
