
import java.awt.*;
import javax.swing.*;
/** DialogReader accepts user input from a dialog window */
public class TestDialogs
{
  public static void main(String[] args)
  { JOptionPane.showMessageDialog(null, "Some information for you to read");

    int i = JOptionPane.showConfirmDialog(null, "Please choose one:");
    System.out.println(i);
    if ( i == JOptionPane.YES_OPTION )
       { System.out.println("yes"); }

    String s = JOptionPane.showInputDialog(null, "Please type a string:");
    if ( s == null )
         { System.out.println("nothing"); }
    else { System.out.println(s); }
  }
}


