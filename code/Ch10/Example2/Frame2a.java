import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** Frame2a shows a frame with whose label displays the number of times
    its button is pushed */
class Frame2a extends JFrame implements ActionListener
{ private Counterl count;  // address of model object
  private JLabel label = new JLabel("count = 0");  // label for the frame

  /** Constructor  Frame2a creates a frame with a label and button
    * @param c - the model object, a counter */
  public Frame2a(Counterl c)
  { count = c;
    Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
      cp.add(label);
      JButton button = new JButton("OK");
      cp.add(button);
      button.addActionListener(this); // this object - the view - is
	                                  // connected to button as 
									  // its action listener
    setTitle("Frame2a");
    setSize(200, 60);
    setVisible(true);
  }

  /** actionPerformed handles an action event---a button push */
  public void actionPerformed(ActionEvent e)
  { count.increment();
    label.setText("count = " + count.countOf());
  }

  public static void main(String[] args)
  { Counterl model = new Counterl(0);     // create the model
    Frame2a view = new Frame2a(model);  // create the controller and view
  }
}