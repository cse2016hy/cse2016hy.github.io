import java.awt.*;
import javax.swing.*;
/** PuzzleFrame shows a slide puzzle */
public class PuzzleFrame extends JFrame
{ private SlidePuzzleBoard board;   // the model; see Fig.11, Ch.8
  private int size;                 // the board's size
  private int button_size = 60;     // width/height of each button
  private PuzzleButton[][] button;  // the buttons on the face of the view

  /** Constructor PuzzleFrame builds the view
    * @param board_size - the width and depth of the puzzle
    * @param b - the model, a slide puzzle board  */
  public PuzzleFrame(int board_size, SlidePuzzleBoard b)
  { size = board_size;
    board = b;
    button = new PuzzleButton[size][size];
    Container cp = getContentPane();
    cp.setLayout(new GridLayout(size, size));
    // create the button-controllers and insert them into the layout:
    for ( int i = 0; i != size; i = i+1 )
        { for ( int j = 0; j != size; j = j+1 )
              { button[i][j] = new PuzzleButton(board, this);
                cp.add(button[i][j]);
              }
        }
    update();  // initialize the pieces with their numbers
    addWindowListener(new ExitController()); // activates X-button; see Fig. 15 
    setTitle("PuzzleFrame");
    setSize(size * button_size + 10,  size * button_size + 20);
    setVisible(true);
  }

  /** update  consults the model and repaints each button */
  public void update()
  { PuzzlePiece[][] r = board.contents();  //  get contents of the puzzle
    for ( int i = 0; i != size; i = i+1 )  // redraw all the buttons
        { for ( int j = 0; j != size; j = j+1 )
              { if ( r[i][j] != null )
                     { button[i][j].setBackground(Color.white);
                       button[i][j].setText("" + r[i][j].valueOf()); }
                else { button[i][j].setBackground(Color.black);
                       button[i][j].setText( "" );
//                       System.out.println(i + ", " + j);
                     }
              }
        }
  }
}