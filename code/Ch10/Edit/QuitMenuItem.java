
import javax.swing.*;
import java.awt.event.*;
/** QuitMenuItem terminates the text editor.  */
public class QuitMenuItem extends JMenuItem implements ActionListener
{ public QuitMenuItem(String label)
  { super(label);
    addActionListener(this);
  }

  public void actionPerformed(ActionEvent e)
  { System.exit(0); }
}