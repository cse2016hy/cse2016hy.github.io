import java.awt.*;
import javax.swing.*;
/** Frame1 is a frame with a label and a button */
public class Frame1 extends JFrame
{ /** Constructor  Frame1  creates a frame with a label and button */
  public Frame1()
  { JLabel label = new JLabel("Press This:");
    JButton button = new JButton("OK");
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(label);
    c.add(button);
    setTitle("Example1");
    setSize(200, 60);			// pack();
    setVisible(true);
  }
  
public static void main(String[] args)
  { new Frame1();
  }
}