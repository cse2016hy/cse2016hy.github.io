import java.awt.*;
import javax.swing.*;
/** Frame1a is a frame with a label and a button */
public class Frame1a extends JFrame
{ /** Constructor  Frame1  creates a frame with a label and button */
  public Frame1a()
  { JLabel label = new JLabel("Press This:");
    JButton button = new JButton("OK");
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(label);
    c.add(button);
    setTitle("Example1");
    setSize(200, 60);		
    setVisible(true);
  }
  
public void paint(Graphics g)    // paint on the glass pane.
{ g.setColor(Color.red);
  g.fillRect(0, 0, 100, 100);
}

public static void main(String[] args)
  { new Frame1a();
  }
}