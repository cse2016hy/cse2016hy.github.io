import java.awt.*;
import javax.swing.*;
/** Frame1b is a frame with a label and a button */
public class Frame1b extends JFrame
{ /** Constructor  Frame1b  creates a frame with a label and button */
  public Frame1b()
  { JLabel label = new JLabel("Press This:");
    label.setForeground(Color.red);		    // new
    JButton button = new JButton("OK");
	button.setBackground(Color.green);		// new
    button.setForeground(Color.red);		// new
    Container c = getContentPane();
    c.setBackground(Color.yellow);		    // new
	c.setLayout(new FlowLayout());
    c.add(label);
    c.add(button);
    setTitle("Example1");
    setSize(200, 60);		
    setVisible(true);
  }
  
public static void main(String[] args)
  { new Frame1b();
  }
}
