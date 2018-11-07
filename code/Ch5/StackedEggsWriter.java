import java.awt.*;
import javax.swing.*;
/** StackedEggsWriter displays three eggs, stacked */
public class StackedEggsWriter extends JPanel
{ private int frame_width;
  private int frame_height;
  // the sizes (widths) of the three eggs stacked:
  private int egg1_size;
  private int egg2_size;
  private int egg3_size;

  /** Constructor StackedEggsWriter stacks three 3-by-2 eggs in a window
    * @param width - the width of the panel
    * @param height - the height of the panel
	* @param size1 - the width of the bottom egg
	* @param size2 - the width of the middle egg
	* @param size3 - the width of the top egg */
  public StackedEggsWriter(int width, int height,
	                       int size1, int size2, int size3)
  { frame_width = width;
    frame_height = height;
	egg1_size = size1;
	egg2_size = size2;
	egg3_size = size3;
	JFrame my_frame = new JFrame();
	my_frame.getContentPane().add(this);
	my_frame.setTitle("StackedEggsWriter");
    my_frame.setSize(frame_width, frame_height);
    my_frame.setBackground(Color.yellow);
    my_frame.setVisible(true);
  }

  /** paintComponent fills the window with the eggs
    * @param g - the graphics pen */
  public void paintComponent(Graphics g)
  { // lay the first egg at the bottom of the frame:
    int egg1_top = paintAnEgg(frame_height, egg1_size, g);
	// stack the two remaining eggs on top of it:
	int egg2_top = paintAnEgg(egg1_top, egg2_size, g);
	int egg3_top = paintAnEgg(egg2_top, egg3_size, g);
  }

  /** paintAnEgg  paints an egg in 3-by-2 proportion
    * (the egg's height is two-thirds of its width)
    * @param bottom - the position of the egg's bottom
    * @param width - the egg's width
    * @param pen - the graphics pen that will draw the egg
	* @return the y-position of the painted egg's top edge. */
  private int paintAnEgg(int bottom, int width, Graphics pen)
  { int height = (2 * width) / 3;
    int top_edge = bottom - height;
	int left_edge = (frame_width - width) /2;
	pen.setColor(Color.pink);
	pen.fillOval(left_edge, top_edge, width, height);
    pen.setColor(Color.black);
	pen.drawOval(left_edge, top_edge, width, height);
	return top_edge;
  }

  /** Test the window: */
  public static void main(String[] args)
  { int total_width = 300;
    int total_height = 200;
	new StackedEggsWriter(total_width, total_height, 50, 90,140);
  }
}
