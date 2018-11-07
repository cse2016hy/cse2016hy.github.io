import java.awt.*;
import javax.swing.*;
/** ThrobPanel draws a throbbing ball */
public class ThrobPanel extends JPanel
{ private int panel_size;       // size of this panel
  private int location;         // where ball will be painted on the panel
  private int ball_size;        // the size of a ``large'' ball
  private Color c = Color.red;  // the ball's color
  private ThrobbingBall ball;   // the ball object

  public ThrobPanel(int size, ThrobbingBall b)
  { panel_size = size;
    location = panel_size / 2;
    ball_size = panel_size / 3;
    ball = b;
    setSize(panel_size, panel_size);
  }

  /** getColor returns the current color of the ball */
  public Color getColor() { return c; }

  /** setColor resets the color of the ball to  new_color */
  public void setColor(Color new_color) { c = new_color; }

  /** paintComponent paints the ball */
  public void paintComponent(Graphics g)
  { g.setColor(Color.white);
    g.fillRect(0, 0, panel_size, panel_size);
    g.setColor(c);
    if ( ball.isLarge() )
         { g.fillOval(location, location, ball_size, ball_size); }
    else { g.fillOval(location, location, ball_size / 2, ball_size / 2); }
  }
}