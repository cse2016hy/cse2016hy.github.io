import java.awt.*;
import javax.swing.*;

public class TempFrameWithDialog extends AbsTempFrame
{
  public TempFrameWithDialog()
  { super(); }

  public void displayError(String s)
  { JOptionPane.showMessageDialog(null, "Error in input: " + s); }
}


