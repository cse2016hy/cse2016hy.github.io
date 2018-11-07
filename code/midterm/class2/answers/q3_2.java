class PuzzlePiece  { 
  private int face_value;  // the value written on the piece's face
  public PuzzlePiece(int value) { face_value = value; }
  public int valueOf() { return face_value; }
}

class SlidePuzzleBoard
{ private int size;   //  the board's size
  private PuzzlePiece[][] board; // the array that holds the pieces

  // one position on the board must be an empty space:
  private int empty_row;  
  private int empty_col;
     // representation invariant:  board[empty_row][empty_col] == null

  public SlidePuzzleBoard(int s)
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
public class SlidePuzzleBoardManager {
  public static void main(String args[]) {
    SlidePuzzleBoard b1 = new SlidePuzzleBoard(4);
    System.out.println(b1.computePossibleWays(15));
    SlidePuzzleBoard b2 = new SlidePuzzleBoard(5);
    System.out.println(b2.computePossibleWays(13));
  }
}

