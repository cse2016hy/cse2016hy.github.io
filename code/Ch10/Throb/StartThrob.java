/** StartThrob assembles the objects of the animation */
public class StartThrob
{ public static void main(String[] a)
  { int frame_size = 180;   // size of displayed frame
    int pause_time = 200;   // speed of animation (smaller is faster)
    ThrobbingBall b = new ThrobbingBall();
    ThrobPanel p = new ThrobPanel(frame_size, b);
    ThrobFrame f = new ThrobFrame(frame_size, p, new ColorButton(p));
    new ThrobController(p, b, pause_time).run();   // important: do this last!
  }
}