import javax.swing.*;
import java.awt.*;
/** BullsEyeWriter paints a bulls-eye on a panel */
public class BullsEyeWriter extends JPanel
{ private int rings;  // how many rings appear in the bulls-eye
  private int size;   // the size of the completed bulls-eye
  private int panel_width;  // width of the graphics panel
  private int offset = 20;  // where to start painting the bulls-eye

  /** Constructor BullsEyeWriter constructs the panel and frames it.
    * @param number_of_rings - how many rings in the bulls-eye
    * @param total_size - the diameter of the bulls-eye  */
  public BullsEyeWriter(int number_of_rings, int total_size)
  { rings = number_of_rings;
    size = total_size;
    panel_width = size + (2 * offset);
    // construct frame for this panel:
    JFrame my_frame = new JFrame();
    my_frame.getContentPane().add(this);
    my_frame.setTitle("Bulls-Eye");
    my_frame.setSize(panel_width, panel_width);
    my_frame.setVisible(true);
  }

  /** paintComponent  draws the bulls-eye
    * @param g - the graphics pen that does the drawing */
  public void paintComponent(Graphics g)
  { g.setColor(Color.yellow); // paint background yellow:
    g.fillRect(0, 0, panel_width, panel_width);
    paintBullsEye(offset, offset, rings, size, g);
  }

  /** paintBullsEye paints a bulls-eye
    * @param x_position - of the upper left corner of the bulls-eye
    * @param y_position - of the upper left corner of the bulls-eye
    * @param rings - the number of rings in the bulls-eye
    * @size - the bulls-eye's diameter
    * @param g - the graphics pen */
  public void paintBullsEye(int x_position, int y_position,
                            int rings, int size, Graphics g)
  { int count = 0;                  // no rings painted just yet
    int diameter = size;            // diameter of next ring to paint
    int ring_width = size / rings;  // set width for each ring
    Color color = Color.red;
    while ( count != rings )
      // invariant: have painted  count  rings so far
      { // calculate upper left corner of ring to paint, centering the
        //  the ring within the bulls-eye by dividing by 2:
        int new_x_position = x_position + ((ring_width * count)/2);
        int new_y_position = y_position + ((ring_width * count)/2);
        // paint the ring:
        g.setColor(color);
        g.fillOval(new_x_position, new_y_position, diameter, diameter);
        // increment variables:
        count = count + 1;
        diameter = diameter - ring_width;
        if ( color == Color.red )
             { color = Color.white; }
        else { color = Color.red; }
      }
  }

  public static void main(String[] args)
  { new BullsEyeWriter(7, 140);
  }

}