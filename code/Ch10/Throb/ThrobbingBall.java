/** ThrobbingBall models a ball that changes size from large to small */
public class ThrobbingBall
{ private boolean is_it_currently_large;  // the ball's state---large or small

  public ThrobbingBall() 
  { is_it_currently_large = true; }

  /** isLarge returns the current state of the ball */
  public boolean isLarge() 
  { return is_it_currently_large; }

  /** throb makes the ball change state between large and small  */
  public void throb() 
  { is_it_currently_large = !is_it_currently_large; }
}