import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ExitButtonl extends JButton implements ActionListener
{
  public ExitButtonl(String my_label)
  { super(my_label); 
    addActionListener(this);
  }

  /** actionPerformed  handles a button-push event
    * @param evt - the event  */
  public void actionPerformed(ActionEvent evt)
  { System.exit(0); }
}


