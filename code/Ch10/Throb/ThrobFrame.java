import java.awt.*;
import javax.swing.*;
/** ThrobFrame displays the throbbing-ball panel and color-change button */
public class ThrobFrame extends JFrame
{ /** Constructor  ThrobFrame  builds the frame
    * @param size - the frame's width
    * @param p - the panel that displays the ball
    * @param b - the color-change button */
  public ThrobFrame(int size, ThrobPanel p, ColorButton b)
  { Container cp = getContentPane();
    cp.setLayout(new BorderLayout());
    cp.add(p, BorderLayout.CENTER);
    cp.add(b, BorderLayout.SOUTH);
    setTitle("Throb");
    setSize(size, size + 40);
    setVisible(true);
  }
}