
import java.awt.*;
import javax.swing.*;
/** Drawing creates a panel that displays a small drawing */
public class Drawing extends JPanel
{ private Counterl count;  // the model object

  public Drawing(Counterl model)
  { count = model;
    setSize(200, 80);
  }

  public void paint(Graphics g)
  { g.setColor(Color.white);
    g.fillRect(0, 0, 150, 80);
   ImageIcon im = new ImageIcon("Smile.gif");
   Image img = im.getImage();
   g.drawImage(img, count.countOf()*5, 0, this); 
    

  }
}


