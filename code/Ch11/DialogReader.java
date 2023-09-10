import javax.swing.*;
/** DialogReader accepts user input from a dialog */
public class DialogReader
{ /** Constructor DialogReader initializes the input view, a dialog  */
  public DialogReader() { }  // nothing to initialize

  /** readString reads a string from the input source.
    * @param prompt - the prompt that prompts the user for input
    * @return the string the user types in response */
  public String readString(String prompt)
  { return  JOptionPane.showInputDialog(prompt); }

  /** readInt reads an integer from the input source
    * @param prompt - the prompt that prompts the user for input
    * @return the integer supplied in response */
  public int readInt(String prompt)
  { int answer = 0;
    String s = readString(prompt);
    try { answer = new Integer(s.trim()).intValue(); }
    catch (RuntimeException e)
          { JOptionPane.showMessageDialog(null,
                 "DialogReader error: " + s + " not an int.");
            answer = readInt(prompt);   // restart
          }
    return answer;
  }

  /** readDouble reads a double from the input source
    * @param prompt - the prompt that prompts the user for input
    * @return the double supplied in response */
  public double readDouble(String prompt)
  { double answer = 0;
    String s = readString(prompt);
    try { answer = new Double(s.trim()).doubleValue(); }
    catch (RuntimeException e)
          { JOptionPane.showMessageDialog(null,
                 "DialogReader error: " + s + " not a double.");
            answer = readDouble(prompt);  // restart
          }
    return answer;
  }
}

