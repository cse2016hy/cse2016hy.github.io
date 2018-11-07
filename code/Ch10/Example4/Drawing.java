import java.awt.*;
import javax.swing.*;
/** Drawing creates a panel that displays a small drawing */
public class Drawing extends JPanel
{ private Counter count;  // the model object

  public Drawing(Counter model)
  { count = model;
    setSize(200, 80);
  }

  public void paintComponent(Graphics g)
  { g.setColor(Color.white);
    g.fillRect(0, 0, 150, 80);
    g.setColor(Color.red);
    for ( int i = 0; i != count.countOf(); i = i+1 )
        { g.fillOval(i * 25, 0, 20, 20); }

  }
}