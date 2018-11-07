
import javax.swing.*;
import java.awt.event.*;
/** CutMenuItem  cuts the selected text from the text area. */
public class CutMenuItem extends EditorMenuItem
{ public CutMenuItem(String label, EditModel model)
  { super(label, model); }

  public void actionPerformed(ActionEvent e)
  { myModel().cut(); }
}

