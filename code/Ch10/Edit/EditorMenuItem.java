
import javax.swing.*;
import java.awt.event.*;
/** EditorMenuItem defines a generic menu item for the text editor  */
public abstract class EditorMenuItem extends JMenuItem implements ActionListener
{ private EditModel buffer; // address of the model manipulated by the menuitem

  public EditorMenuItem(String label, EditModel model)
  { super(label);
    buffer = model;
    addActionListener(this);
  }

  /** myModel returns the address of the model this menu item manipulates */
  public EditModel myModel()
  { return buffer; }

  public abstract void actionPerformed(ActionEvent e);
}

