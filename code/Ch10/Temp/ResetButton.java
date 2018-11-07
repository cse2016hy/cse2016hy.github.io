
import java.awt.event.*;
import javax.swing.*;
/** ResetButton implements a button that resets the fields of a lottery GUI */
public class ResetButton extends JButton implements ActionListener
{ private AbsTempFrame view;  // address of the view object that gets reset

  /** Constructor ResetButton constructs the button
    * @param v - the address of the view object */
  public ResetButton(String label, AbsTempFrame v)
  { super(label);
    view = v;
    addActionListener(this); 
  }

  /** actionPerformed  resets the view's text fields */
  public void actionPerformed(ActionEvent evt)
  { view.resetFields(); }
}

