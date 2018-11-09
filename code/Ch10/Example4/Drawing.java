import java.awt.*;
import javax.swing.*;
/** Drawing creates a panel that displays a small drawing */
public class Drawing extends JPanel
{ private Counter4 count;  // the model object

  public Drawing(Counter4 model)
  { count = model;
    setSize(400, 160);
  }

  public void paintComponent(Graphics g)
  { g.setColor(Color.white);
    g.fillRect(0, 0, 400, 160);
    g.setColor(Color.red);
    int x = 0, y = 0;
    for ( int i = 0; i != count.countOf(); i = i+1 )
        { g.fillOval(x * 25, y * 25, 20, 20);
        x++; if(x>7) { x=0; y++; }
        }

  }
}