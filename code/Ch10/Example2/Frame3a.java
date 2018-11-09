import java.awt.*;
import javax.swing.*;
/** Frame3a shows a frame with whose label displays the number of times
    its button is pushed */
class Frame3a extends Frame2c
{
  /** Constructor  Frame3a creates a frame with a label and button
    * @param c - the model object, a counter */
  public Frame3a(Counterl c)
  { super(c);  // tell superclass to construct most of the frame
    Container cp = getContentPane();
    cp.add(new ExitButton4("Exit"));  // add another button-controller
	addWindowListener(new ExitController());  // New!
    setTitle("Example 3");
    setSize(250, 60); 
	setVisible(true);
  }

  public static void main(String[] args)
  { Counterl model = new Counterl(0);
    Frame3a view = new Frame3a(model);
  }
}