
//import javax.swing.*;
import java.awt.event.*;
/** ClearMenuItem clears a text area */
public class ClearMenuItem extends EditorMenuItem
{ public ClearMenuItem(String label, EditModel model)
  { super(label, model); }

  public void actionPerformed(ActionEvent e)
  { myModel().clear(); }
}

