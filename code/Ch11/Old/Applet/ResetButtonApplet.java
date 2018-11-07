
import java.awt.*;  import java.awt.event.*;
/** ResetButton implements a button that resets the fields of a lottery GUI */
public class ResetButtonApplet extends Button implements ActionListener
{ private LotteryApplet1 f;  // address of the view object that gets reset

  /** Constructor ResetButton constructs the button
    * @param ff - the address of the view object */
  public ResetButtonApplet(LotteryApplet1 ff)
  { super("Reset");  addActionListener(this);  f = ff;  }

  /** actionPerformed  resets the view's text fields */
  public void actionPerformed(ActionEvent evt) { f.resetFields(); }
}


