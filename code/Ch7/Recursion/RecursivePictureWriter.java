import java.awt.*;  
import javax.swing.*;
/** RecursivePictureWriter displays a recursively defined picture of an
  * egg in front of a picture (of eggs). */
public class RecursivePictureWriter extends JPanel
{ private double scale = 0.8;  // the size of the background picture relative
                               //   to the foreground
  private int width = 400;     // frame width and depth
  private int depth = 200;
  private int first_egg = 150; // size of the egg in the foreground

  /** Constructor RecursivePictureWriter creates the window */
  public RecursivePictureWriter()
  { JFrame my_frame = new JFrame();
    my_frame.getContentPane().add(this);
    my_frame.setTitle("RecursivePictureWriter");
    my_frame.setSize(width, depth);
    my_frame.setBackground(Color.white);
    my_frame.setVisible(true);
  }

  /** paintComponent paints the recursively defined picture
    * @param g - the ``graphics pen'' */
  public void paintComponent(Graphics g)
  { g.setColor(Color.white);
    g.fillRect(0, 0, width, depth);  // paint the background
    paintPicture(width, depth, first_egg, g); 
  }

  /** paintPicture paints a picture of an egg in front of a picture of eggs.
    * @param right_border - the right border of the picture painted
    * @param bottom - the bottom border of the picture painted
    * @param size - the size of the egg to be painted in the foreground
    * @param g - the graphics pen  */
  private void paintPicture(int right_border, int bottom,
                            int size, Graphics g)
  { // paint the background picture first:
    int background_size = (int)(size * scale);
    if ( background_size > 0 )  // is the background worth painting?
       { paintPicture((int)(right_border * scale), (int)(bottom * scale),
                       background_size, g);
       }
    // paint an egg in the foreground:
    paintAnEgg(right_border - size, bottom, size, g);
    g.setColor(Color.black); 
    g.drawRect(0, 0, right_border, bottom);  // draw the border
  }

  /** paintAnEgg  paints an egg in 2-by-3 proportion
    * @param left_edge - the position of the egg's left edge
    * @param bottom - the position of the egg's bottom
    * @param width - the egg's width
    * @param g - the graphics pen  */
  private void paintAnEgg(int left_edge, int bottom, int width, Graphics g)
  { int height = (2 * width) / 3;
    int top = bottom - height;
    g.setColor(Color.pink);
    g.fillOval(left_edge, top, width, height);
    g.setColor(Color.black);
    g.drawOval(left_edge, top, width, height);
  }

  public static void main(String[] args)
  { new RecursivePictureWriter(); }
}

