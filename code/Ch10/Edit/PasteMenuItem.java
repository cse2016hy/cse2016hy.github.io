
import javax.swing.*;
import java.awt.event.*;
/** PasteMenuItem moves contents of the clipboard into the text area */
public class PasteMenuItem extends EditorMenuItem
{ public PasteMenuItem(String label, EditModel model)
  { super(label, model); }

  public void actionPerformed(ActionEvent e)
  { myModel().paste(); }
}

