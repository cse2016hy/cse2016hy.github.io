package payroll;
import java.awt.*;
import javax.swing.*;
/** DialogReader accepts user input from a dialog window */
public class DialogReader
{
  /** Constructor DialogReader initializes the input view, a dialog  */
  public DialogReader() { }

  /** readString reads a string from the input source.
    * @param prompt - the prompt that prompts the user for input
    * @return the string the user types in response */
  public String readString(String prompt)
  { String input = JOptionPane.showInputDialog(prompt); // see Chapter 10
    return input;
  }

  /** readInt reads an integer from the input source
    * @param prompt - the prompt that prompts the user for input
    * @return the integer suppled in response */
  public int readInt(String prompt)
  { int input = -1;
    try { input = new Integer( readString(prompt).trim() ).intValue(); }
    catch (RuntimeException e)
          { System.out.println("LineReader error: input not an integer"); }
    return input;
  }

  /** readDouble reads a double from the input source
    * @param prompt - the prompt that prompts the user for input
    * @return the double suppled in response */
  public double readDouble(String prompt)
  { double input = -0.1;
    try { input = new Double( readString(prompt).trim() ).doubleValue(); }
    catch (RuntimeException e)
          { System.out.println("LineReader error: input not a double"); }
    return input;
  }
}