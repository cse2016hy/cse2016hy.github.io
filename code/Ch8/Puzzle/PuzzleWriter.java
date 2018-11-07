import java.awt.*;  
import javax.swing.*;
/** PuzzleWriter  displays the contents of a slide puzzle */
public class PuzzleWriter extends JPanel
{ private SlidePuzzleBoard board; // the board that is displayed
  private int size;               // the board's size
  private int piece_size = 60;    // the size of one playing piece, in pixels
  private int panel_width;        // the panel's width and height
  private int panel_height;

  /** Constructor PuzzleWriter builds the graphics window.
    * @param b - the slide puzzle that is displayed
    * @param s - the size of the slide puzzle, e.g., 4 means  4 x 4  */
  public PuzzleWriter(SlidePuzzleBoard b, int s)
  { board = b;
    size = s;
    panel_width = piece_size * size  + 100;
    panel_height = piece_size * size  + 100;
    JFrame my_frame = new JFrame();
    my_frame.getContentPane().add(this);
    my_frame.setTitle("Slide Puzzle");
    my_frame.setSize(panel_width, panel_height);
    my_frame.setVisible(true);
  }

 /** paintPiece  draws piece  p  at position  i,j  in the window  */
  private void paintPiece(Graphics g, PuzzlePiece p, int i, int j)
  { int initial_offset = piece_size;
    int x_pos = initial_offset + (piece_size * j);
    int y_pos =  initial_offset + (piece_size * i);
    if ( p != null )
         { g.setColor(Color.white);
           g.fillRect(x_pos, y_pos, piece_size, piece_size);
           g.setColor(Color.black);
           g.drawRect(x_pos, y_pos, piece_size, piece_size);
           g.drawString(p.valueOf() + "", x_pos + 10, y_pos + 20);
         }
    else { g.setColor(Color.black);
           g.fillRect(x_pos, y_pos, piece_size, piece_size);
         }
  }

  /** paintComponent  displays the puzzle in the frame. */
  public void paintComponent(Graphics g)
  { g.setColor(Color.yellow);
    g.fillRect(0, 0, panel_width, panel_height);
    PuzzlePiece[][] r = board.contents();
    for ( int i = 0;  i != size;  i= i+1 )
        { for ( int j = 0;  j != size;  j = j+1 )
              { paintPiece(g, r[i][j], i, j); }
        }
  }

  /** displayPuzzle displays the current state of the slide puzzle. */
  public void displayPuzzle()
  { this.repaint(); }

  /** printError displays an error message.
    * @param s - the error message */
  public void printError(String s)
  { JOptionPane.showMessageDialog(null, "PuzzleWriter error: " + s ); }
}


