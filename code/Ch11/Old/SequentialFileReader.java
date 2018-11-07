import java.io.*;
/** SequentialFileReader implements input of strings, ints, and doubles from
    a sequential file. */
public class SequentialFileReader extends TextReader  // see Fig. 11, Ch. 9
{ private BufferedReader reader;  // holds the address of the file

  /** Constructor SequentialFileReader constructs the input-view object
    * @param name - the path name of the sequential file */
  public SequentialFileReader(String name)
  { try { reader = new BufferedReader(new FileReader(name)); }
    catch (IOException e)
          { System.out.println("SequentialFileReader error: " + e.getMessage());
            System.out.println("Unrecoverable error---terminating!");
            throw new RuntimeException(e.toString());
          }
  }

  /** readString reads a string from the input source
    * @param prompt - a prompt (ignored here)
    * @return the string supplied in response  */
  public String readString(String prompt)
  { String s = null;
    try { s = reader.readLine(); }
    catch (IOException e)
          { System.out.println("SequentialFileReader input error"); }
    return s;
  }
}
