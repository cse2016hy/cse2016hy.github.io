import javax.swing.*;
import java.awt.*;
/** BullsEyeWriter paints a bulls-eye on a panel */
public class ChessWriter extends JPanel
{ 
  private int panel_width;  // width of the graphics panel
  private int offset = 40;  // where to start painting the bulls-eye

  /** Constructor BullsEyeWriter constructs the panel and frames it.
    * @param number_of_rings - how many rings in the bulls-eye
    * @param total_size - the diameter of the bulls-eye  */
  public ChessWriter()
  { 
    panel_width = 400;
    // construct frame for this panel:
    JFrame my_frame = new JFrame();
    my_frame.getContentPane().add(this);
    my_frame.setTitle("ChessWriter");
    my_frame.setSize(panel_width, panel_width);
    my_frame.setVisible(true);
  }

  /** paintComponent  draws the bulls-eye
    * @param g - the graphics pen that does the drawing */
  public void paintComponent(Graphics g)
  { g.setColor(Color.yellow); // paint background yellow:
    g.fillRect(0, 0, panel_width, panel_width);
    paintBoard(offset, offset, 8, offset, g);
  }

  /** paintBullsEye paints a bulls-eye
    * @param x_position - of the upper left corner of the bulls-eye
    * @param y_position - of the upper left corner of the bulls-eye
    * @param rings - the number of rings in the bulls-eye
    * @size - the bulls-eye's diameter
    * @param g - the graphics pen */
  /** paintBoard paints an n-by-n chessboard of red and white squares * @param start x - position of the upper left corner of the board * @param start y - position of the upper left corner of the board * @param total rows - the number of rows of the board
  * @param square size - the width of each square, in pixels
  * @param g - the graphics pen */
  private void paintBoard(int start_x, int start_y, int total_rows, int square_size, Graphics g) 
  {
	  for (int x=0; x < total_rows; x=x+1) // invariant: have painted x rows so far 
	  { // calculate position of row x:
		  int x_position = start_x + (x * square_size); 
		  for (int y=0; y < total_rows; y=y+1) // invariant: have painted y squares of row x 
		 { // calculate position of the y-th square:
			  int y_position = start_y + (y * square_size); 
			  if (((x+y)%2)==0) //is square x,y a red one?
			  { g.setColor(Color.red); }
			  else { 
				  g.setColor(Color.white); }
			  	  g.fillRect(x_position, y_position, square_size, square_size);
		 	  } 
		  }
  }

  public static void main(String[] args)
  { new ChessWriter();
  }

}