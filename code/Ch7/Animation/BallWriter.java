import java.awt.*;
/** BallWriter displays a moving ball */
public class BallWriter
{ private MovingBall ball;   // the (address of the) ball object displayed
  private Color balls_color; // the ball's color

  /** Constructor BallWriter
    * @param x - the ball to be displayed
    * @param c - its color */
  public BallWriter(MovingBall x, Color c)
  { ball = x;
    balls_color = c;
  }

  /** paint paints the ball on the view
    * @param g - the graphics pen used to paint the ball */
  public void paint(Graphics g)
  { g.setColor(balls_color);
    int radius = ball.radiusOf();
    g.fillOval(ball.xPosition() - radius,
               ball.yPosition() - radius, radius * 2, radius * 2);
  }
}

