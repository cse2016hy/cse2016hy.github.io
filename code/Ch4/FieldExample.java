import java.awt.*; 
import javax.swing.*; 
/** FieldExample displays how often a window is painted on the display */
public class FieldExample extends JPanel 
{ private int count; // this field variable holds the count of how often
                              // the window has been painted;
                              // for this reason, its value must always be nonnegative 
  
  /** FieldExample constructs the window */
  public FieldExample() 
  { count = 0; // the window has never been painted
    // construct the panel's frame and display it:
	JFrame my_frame = new JFrame();
	my_frame.getContentPane().add(this);
	int height = 200;
	my_frame.setSize((3 * height)/2, height);
    my_frame.setVisible(true); 
  } 

  /** paintComponent paints the count of paintings
    * @param g - the graphics pen */
  public void paintComponent(Graphics g) 
  { count = count + 1; // we are painting one more time
    g.setColor(Color.black); 
	int margin = 25;
	int line_height = 20;
	int first_line = 40;
	int baseline = first_line + (line_height * count);
    g.drawString("Painted " + count + " times", margin, baseline); 
  } 

  /** The main method assembles the panel and frame and shows them */
  public static void main(String[] args)
	{ new FieldExample(); }
} 
