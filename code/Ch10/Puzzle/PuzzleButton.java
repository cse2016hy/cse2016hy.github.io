import javax.swing.*;
import java.awt.event.*;
/** PuzzleButton implements a button controller for a puzzle game */
public class PuzzleButton extends JButton implements ActionListener
{ private SlidePuzzleBoard puzzle; // address of the SlidePuzzle model
  private PuzzleFrame view;  // address of Frame that displays this button

  /** Constructor PuzzleButton builds the button
    * @param my_puzzle - the address of the puzzle model object
    * @param my_view - the address of the puzzle's view */
  public PuzzleButton(SlidePuzzleBoard my_puzzle, PuzzleFrame my_view)
  { super(""); // set label to nothing, but this will be repainted by the view
    puzzle = my_puzzle;
    view = my_view;
    addActionListener(this);
  }

  /** actionPerformed processes a move of the slide puzzle */
  @Override
  public void actionPerformed(ActionEvent evt)
  { String s = getText();  // get the number on the face of this button
    if ( !s.equals("") )   // it's not the blank space, is it?
       { boolean ok = puzzle.move(new Integer(s).intValue()); // try to move
         if ( ok ) { view.update(); }
       }
  }

}


