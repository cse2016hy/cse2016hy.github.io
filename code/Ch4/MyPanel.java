import java.awt.*;
import javax.swing.*;
/**  MyPanel creates a colorful panel */
public class MyPanel extends JPanel
{ /** paintComponent fills the panel with the items to be displayed
     * @param g - the "graphics pen" that draws the items on the panel */
  public void paintComponent(Graphics g)
  { g.setColor(Color.red);
    int left_edge = 105;
	int top = 70;
	// draw a rectangle:
	int width = 90;
	int height = 60;
	g.drawRect(left_edge, top, width, height);
	// draw a filled circle:
	int diameter = 40;
	g.fillOval(left_edge + width - diameter, top, diameter, diameter);
  }
}
