/** BounceController controls a moving ball within a box.  */
public class BounceController
{ private MovingBall ball;  // model object
  private AnimationWriter writer; // output-view object

  /** Constructor BounceController initializes the controller
    * @param b - the model object
    * @param w - the output-view object  */
  public BounceController(MovingBall b, AnimationWriter w)
  { ball = b;
    writer = w;
  }

  /** runAnimation  runs the animation by means of an internal clock */
  public void runAnimation()
  { int time_unit = 5;    // time unit for each step of the animation
    int painting_delay = 20;  // how long to delay between repaintings
    while ( true )
          { delay(painting_delay);
            ball.move(time_unit); 
            System.out.println(ball.xPosition() + ", " + ball.yPosition());
            writer.repaint();  // redisplay box and ball
          }
  }

  /** delay pauses execution for  how_long  milliseconds */
  private void delay(int how_long)
  { try { Thread.sleep(how_long); }
    catch (InterruptedException e) { }
  }
}

