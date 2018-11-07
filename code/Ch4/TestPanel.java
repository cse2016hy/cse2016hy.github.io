import java.awt.*;
import javax.swing.*;
/**  TestPanel creates a panel that displays a string  */
public class TestPanel extends JPanel
{ /** paintComponent paints the panel
     * @param g - the "graphics pen" that draws the items on the panel */
  public void paintComponent(Graphics g)
  { g.setColor(Color.red);
    g.drawString("Hello to you!", 30, 80);
  }
}
