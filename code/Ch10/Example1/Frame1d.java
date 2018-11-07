import java.awt.*;
import javax.swing.*;
/** Frame1c is a frame with a label and a button */
public class Frame1d extends JFrame
{ /** Constructor  Frame1d  creates a frame with a label and button */
  public Frame1d()
  { JButton button = new JButton("Press This:", 
	                             new ImageIcon("smile.gif")); // new
    button.setBackground(Color.green);
    Container c = getContentPane();
    c.setBackground(Color.yellow);	
	c.setLayout(new FlowLayout());
    c.add(button);
    setTitle("Example1");
    pack();									
    setVisible(true);
  }
  
public static void main(String[] args)
  { new Frame1d();
  }
}