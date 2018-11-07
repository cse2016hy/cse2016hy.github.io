import java.awt.*;
/** BounceTheBall constructs and starts the objects in the animation.  */
public class BounceTheBall
{ public static void main(String[] args)
  { // construct the model objects:
    int box_size = 100;
    int balls_radius = 2;
    Box box = new Box(box_size);
    // place the ball not quite in the box's center; about 3/5 position:
    MovingBall ball = new MovingBall((int)(box_size / 3.0),
                                     (int)(box_size / 5.0),
                                     balls_radius, box);
    BallWriter ball_writer = new BallWriter(ball, Color.red);
    BoxWriter box_writer  = new BoxWriter(box);
    AnimationWriter writer
             = new AnimationWriter(box_writer, ball_writer, box_size);
    // construct the controller and start it:
    new BounceController(ball, writer).runAnimation();
  }
}

