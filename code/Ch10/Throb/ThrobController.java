/** ThrobController runs the throbbing-ball animation */
public class ThrobController
{ private ThrobPanel writer; // the output-view panel
  private ThrobbingBall ball;  // the ball model object
  private int time;  // how long animation is delayed before redrawn

  /** ThrobController initializes the controller
    * @param w - the panel that is controlled
    * @param b - the ball that is controlled
    * @param delay_time - the amount of time between redrawing the animation */
  public ThrobController(ThrobPanel w, ThrobbingBall b, int delay_time)
  { writer = w;
    ball = b;
    time = delay_time;
  }

  /** run  runs the animation  forever */
  public void run()
  { while ( true )
          { ball.throb();
            writer.repaint();  // redisplay ball
            delay();
          }
  }

  /** delay pauses execution for  time  milliseconds */
  private void delay()
  { try { Thread.sleep(time); }
    catch (InterruptedException e) { }
  }
}