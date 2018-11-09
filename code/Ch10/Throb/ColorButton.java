import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/** ColorButton controls the color of the ball */
public class ColorButton extends JButton implements ActionListener
{ private ThrobPanel view;  // the view object where shapes are drawn

  public ColorButton(ThrobPanel f)
  { super("OK");
    view = f;
    addActionListener(this);
  }

  /** actionPerformed handles a click */
  @Override
  public void actionPerformed(ActionEvent e)
  { Color c = view.getColor();
    if ( c == Color.red )
         { view.setColor(Color.blue); }
    else { view.setColor(Color.red); }
  }

}