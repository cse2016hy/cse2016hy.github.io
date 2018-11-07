import java.awt.*;
import javax.swing.*;
/** Frame3 shows a frame with whose label displays the number of times
    its button is pushed */
class Frame3 extends Frame2c
{
  /** Constructor  Frame3 creates a frame with a label and button
    * @param c - the model object, a counter */
  public Frame3(Counter c)
  { super(c);  // tell superclass to construct most of the frame
    Container cp = getContentPane();
    cp.add(new ExitButton("Exit"));  // add another button-controller
//	addWindowListener(new ExitController());
    setTitle("Example 3");
    setSize(250, 60); 
	setVisible(true);
  }

  public static void main(String[] args)
  { Counter model = new Counter(0);
    Frame3 view = new Frame3(model);
  }
}