
import javax.swing.*;
import java.awt.event.*;
/** ReplaceMenuItem shows the frame that helps the user replace strings */
public class ReplaceMenuItem extends JMenuItem implements ActionListener
{ private ReplaceFrame my_view;

  public ReplaceMenuItem(String label, ReplaceFrame view)
  { super(label);
    my_view = view;
    addActionListener(this);
  }

  public void actionPerformed(ActionEvent e)
  { my_view.setVisible(true); }
}


