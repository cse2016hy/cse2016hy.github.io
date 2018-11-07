import java.awt.*;
import javax.swing.*;
/** AnimationWriter displays a box with a ball in it.  */
public class AnimationWriter extends JPanel
{ private BoxWriter box_writer;    // the output-view of the box
  private BallWriter ball_writer;  // the output-view of the ball in the box

  /** Constructor AnimationWriter constructs the view of box and ball
    * @param b - the box's writer
    * @param l - the ball's writer
    * @param size - the frame's size */
  public AnimationWriter(BoxWriter b, BallWriter l, int size)
  { box_writer = b;
    ball_writer = l;
    JFrame my_frame = new JFrame();
    my_frame.getContentPane().add(this);
    my_frame.setTitle("Bounce");
    my_frame.setSize(size, size);
    my_frame.setVisible(true);
  }

  /** paintComponent paints the box and ball
    * @param g - the graphics pen */
  public void paintComponent(Graphics g)
  { box_writer.paint(g);
    ball_writer.paint(g);
  }
}
