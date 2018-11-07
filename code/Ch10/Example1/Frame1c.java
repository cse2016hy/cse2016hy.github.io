import java.awt.*;
import javax.swing.*;
/** Frame1c is a frame with a label and a button */
public class Frame1c extends JFrame
{ /** Constructor  Frame1c  creates a frame with a label and button */
  public Frame1c()
  { JLabel label = new JLabel("Press This:");
    label.setForeground(Color.red);
	ImageIcon i = new ImageIcon("smile.gif");	// new
	JButton button = new JButton(i);			// changed
    Container c = getContentPane();
    c.setBackground(Color.yellow);	
	c.setLayout(new FlowLayout());
    c.add(label);
    c.add(button);
    setTitle("Example1");
    pack();										// new
    setVisible(true);
  }
  
public static void main(String[] args)
  { new Frame1c();
  }
}