/** SlidePuzzleBoard models a slide puzzle. */
public class SlidePuzzleBoard
{ private int size;   //  the size of the game board
  private PuzzlePiece[][] board; // the game board where the pieces lay

  // one position on the board must be an empty space:
  private int empty_row;  
  private int empty_col;
     // representation invariant:  board[empty_row][empty_col] == null

  /** Constructor SlidePuzzleBoard constructs the initial puzzle, which has
    *   the pieces arranged in descending numerical order.
    * @param s - the size of the puzzle (e.g., s==4 means that the puzzle
    *   is 4 x 4 and will have pieces numbered  15, 14, ..., 2, 1) */
  public SlidePuzzleBoard(int s)
  { size = s;
    board = new PuzzlePiece[size][size];
    // create the individual pieces and place on the board in reverse order:
    for ( int num = 1;  num != size*size;  num = num+1 )
        { PuzzlePiece p = new PuzzlePiece(num); 
          int row = num / size;
          int col = num % size;
          // set  p  in a ``reversed position'' on the board:
          board[size-1 - row][size-1 - col] = p;
        }
    // remember the location on the board where initially there is no piece:
    empty_row = size-1;
    empty_col = size-1;
  }

  /** contents  returns the current state of the puzzle
    * @return a matrix that contains the addresses of the pieces */
  public PuzzlePiece[][] contents()
  { PuzzlePiece[][] answer = new PuzzlePiece[size][size];
    for ( int i = 0;  i != size;  i = i+1 )
        { for ( int j = 0;  j != size;  j = j+1 )
              { answer[i][j] = board[i][j]; }
        }
    return answer;
  }

  /** move  moves a piece into the blank space, provided it is a legal move.
    * @param w - the face value of the piece that one wishes to move
    * @return true, if the piece labelled by  w  was moved into the empty space;
    *  return false if the piece cannot be moved into the empty space */
  public boolean move(int w)
  { int row = -1;  // row and col remember the coordinates where  w  lives
    int col = -1;
    // try to find  w  adjacent to the empty space on the board:
    if ( found(w, empty_row-1, empty_col) )
       { row = empty_row-1;
         col = empty_col;
       }
    else if ( found(w, empty_row+1, empty_col) )
       { row = empty_row+1;
         col = empty_col;
       }
    else if ( found(w, empty_row, empty_col-1) )
       { row = empty_row;
         col = empty_col-1;
       }
    else if ( found(w, empty_row, empty_col+1) )
       { row = empty_row;
         col = empty_col+1;
       }

    if ( row != -1 )  // piece labelled  w  is found adjacent to empty space
       { // move the piece into the empty space:
         board[empty_row][empty_col] = board[row][col];
         // mark the new empty space on board:
         empty_row = row;
         empty_col = col;
         board[empty_row][empty_col] = null; 
       }
    return (row != -1);
  }
         
  /** found returns whether the piece at position  row, col  is labeled  v */
  private boolean found(int v, int row, int col)
  { boolean answer = false;
    if ( row >= 0  &&  row < size  &&  col >= 0  &&  col < size )
       { answer = ( board[row][col].valueOf() == v ); }
    return answer;
  }
}