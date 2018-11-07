import javax.swing.*;
/** PuzzleController controls the moves of a slide puzzle */
public class PuzzleController
{ private SlidePuzzleBoard board;  // model
  private PuzzleWriter writer;     // output view

  /** Constructor PuzzleController initializes the controller
    * @param b - the model, the puzzle board
    * @param w - the output view  */
  public PuzzleController(SlidePuzzleBoard b, PuzzleWriter w)
  { board = b;
    writer = w;
  }

  /** play lets the user play the puzzle  */
  public void play()
  { while ( true )
          { writer.displayPuzzle();
            int i = new Integer
                     (JOptionPane.showInputDialog("Your move:")).intValue();
            boolean good_outcome = board.move(i);
            if ( !good_outcome )
                 { writer.printError("Bad move--puzzle remains the same."); }
          }
  }
}
