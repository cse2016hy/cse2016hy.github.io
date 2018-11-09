import java.awt.*;
import javax.swing.*;
/** Frame4 is a frame with a label and a button */
public class Frame4 extends JFrame
{ private Counter4 count;  // address of model object
  private JLabel lab = new JLabel("count = 0");  // label for the frame
  private JPanel drawing; // a drawing for the center of the frame

  /** Constructor  Frame4 creates a frame with label, drawing, and 2 buttons
    * @param c - the model object, a counter
    * @param panel - a panel that displays a drawing  */
  public Frame4(Counter4 c, JPanel panel)
  { count = c;
    drawing = panel;
    Container cp = getContentPane();
      cp.setLayout(new BorderLayout());
      JPanel p1 = new JPanel(new FlowLayout());
        p1.add(lab);
      cp.add(p1, BorderLayout.NORTH);
      cp.add(drawing, BorderLayout.CENTER);
      JPanel p2 = new JPanel(new FlowLayout());
        p2.add(new CountButton4("Count", count, this));
        p2.add(new ExitButton4("Quit"));
      cp.add(p2, BorderLayout.SOUTH);
    setTitle("Example4");
    setSize(200,150);
    setVisible(true);
  }

  /** update revises the view */
  public void update()
  { lab.setText("count = " + count.countOf());
    drawing.repaint();
  }
}
