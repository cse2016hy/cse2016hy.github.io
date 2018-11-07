

import java.io.*;
import javax.swing.*;
/** LineReader does line-based input of strings, ints, and doubles. */
public class LineReaderImproved
{ private BufferedReader k;
      // holds the address of the object connected to the physical input source

  /** Constructor LineReader constructs the input-view object
    * @param source - the source of the input, usually the System.in  object */
  public LineReaderImproved(InputStream source)
  { k = new BufferedReader(new InputStreamReader(source)); }

  /** readString reads a string from the input source
    * @param prompt - the prompt that prompts the user for input
    * @return the string supplied in response  */
  public String readString(String prompt)
  { System.out.print(prompt);
    String s = null;  // ``null'' means ``no value at all''
    try { s = k.readLine(); }
    catch (IOException e)
          { System.out.println("LineReader input error"); }
    return s; 
  }

/** readInt reads an integer from the input source
  * @param prompt - the prompt that prompts the user for input
  * @return the integer supplied in response. (And keep trying until the user
  *   supplies a legal integer!)  */
public int readInt(String prompt)
{ int input = -1;
  try { input = new Integer( readString(prompt).trim() ).intValue(); }
  catch (NumberFormatException e)
        { JOptionPane.showMessageDialog(null, "Reader error: "
                  + e.getMessage() + " not an integer; try again.");
          input = readInt(prompt);  // try again to read an integer
        }
  return input;
}

  /** readDouble reads a double from the input source
    * @param prompt - the prompt that prompts the user for input
    * @return the double supplied in response, or -0.1 if input is invalid */
  public double readDouble(String prompt)
  { double input = -0.1;
    try { input = new Double( readString(prompt).trim() ).doubleValue(); }
    catch (RuntimeException e)
          { System.out.println("Reader error: input not a double"); }
    return input;
  }
}


