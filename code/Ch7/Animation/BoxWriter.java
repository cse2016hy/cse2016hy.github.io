import java.awt.*;
/** BoxWriter displays a box  */
public class BoxWriter
{ private Box box;   // the (address of the) box object that is displayed

  /** Constructor BoxWriter displays the box
    * @param b - the box that is displayed */
  public BoxWriter(Box b)
  { box = b; }

  /** paint paints the box
    * @param g - the graphics pen used to paint the box */
  public void paint(Graphics g)
  { int size = box.sizeOf();
    g.setColor(Color.white);
    g.fillRect(0, 0, size, size);
    g.setColor(Color.black);
    g.drawRect(0, 0, size, size);
  }
}
