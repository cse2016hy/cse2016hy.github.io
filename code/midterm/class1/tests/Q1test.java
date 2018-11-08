
class BounceControllerAnswer { 
  private MovingBall ball;  // model object
  public BounceControllerAnswer(MovingBall b) { ball = b; }
  public int howlong(int x_pos_dest, int y_pos_dest) {
	int time_taken = 0; 
	while (true) {
		if (ball.xPosition() == x_pos_dest && ball.yPosition() == y_pos_dest) break;
		ball.move(1);
		time_taken++; 
	}
	return time_taken;
  }
}

public class Q1test {
    public void test(int x_pos, int y_pos) {
        int box_size = 400;
        Box box = new Box(box_size);
        int x_init = (int)(box_size / 3.0);
        int y_init = (int)(box_size / 5.0);
        MovingBall ball1 = new MovingBall(x_init, y_init, box);
        MovingBall ball2 = new MovingBall(x_init, y_init, box);
        BounceControllerAnswer controller_answer = new BounceControllerAnswer(ball1); 
        BounceController controller = new BounceController(ball2);        
        assertTrue(controller_answer.howlong(x_pos, y_pos) == controller.howlong(x_pos, y_pos));
    }
    @Test(timeout=5000)
    public void test1() {
        int x_pos = 397, y_pos = 348; 
        test(x_pos, y_pos);
    }
    @Test(timeout=5000)
    public void test2() {
        int x_pos = 292, y_pos = 390; 
        test(x_pos, y_pos);
    }
    @Test(timeout=5000)
    public void test3() {
        int x_pos = 93, y_pos = 224; 
        test(x_pos, y_pos);
    }
    @Test(timeout=5000)
    public void test4() {
        int x_pos = 182, y_pos = 206; 
        test(x_pos, y_pos);
    }
    @Test(timeout=5000)
    public void test5() {
        int x_pos = 168, y_pos = 94; 
        test(x_pos, y_pos);
    }
}
