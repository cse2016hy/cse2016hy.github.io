import java.awt.*;
import javax.swing.*;
/** Frame2b shows a frame with whose label displays the number of times
    its button is pushed */
public class Frame2b extends JFrame
{ private Counterl count;  // address of model object
  private JLabel label = new JLabel("count = 0");  // label for the frame

  /** Constructor  Frame2b creates a frame with a label and button
    * @param c - the model object, a counter */
  public Frame2b(Counterl c)
  { count = c;
    Container cp = getContentPane();
      cp.setLayout(new FlowLayout());
      cp.add(label);
      JButton button = new JButton("OK");
      button.addActionListener(new CountController(count, this)); // see Fig. 10.12
      cp.add(button);
    setTitle("Frame2");
    setSize(200, 60);
    setVisible(true);
  }

  /** update revises the view */
  public void update()
  { label.setText("count = " + count.countOf()); }

  public static void main(String[] args)
  { Counterl model = new Counterl(0);
    Frame2b view = new Frame2b(model);
  }
}