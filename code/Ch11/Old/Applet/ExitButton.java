
import java.awt.*;  import java.awt.event.*;
public class ExitButton extends Button implements ActionListener
{ public ExitButton() { super("Exit");  addActionListener(this); }

  public void actionPerformed(ActionEvent evt) { System.exit(0); }
}

