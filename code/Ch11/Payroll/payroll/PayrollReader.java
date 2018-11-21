package payroll;
import java.io.*;
import java.util.*;
/** PayrollReader reads records from a sequential file.  The records have
  * the format,  NAME|HOURS|PAYRATE.   The file is terminated by a  !  */
public class PayrollReader
{ private BufferedReader infile;  // the address of the input file
  private String END_OF_FILE = "!";
  // the name, hours, and payrate of the most recently read record:
  private String name;
  private int hours;
  private double payrate;

  /** PayrollReader constructs the reader to read from file  file_name */
  public PayrollReader(String file_name)
  { try { infile = new BufferedReader(new FileReader(file_name)); }
    catch (Exception e)
          { System.out.println("PayrollReader error: bad file name: "
                               + file_name + "   Aborting!");
            throw new RuntimeException(e.toString());
          }
  }

//  public boolean unsafe_getNextRecord() {
//		if(!infile.ready()) return false;
//		String line = infile.readLine();
//		StringTokenizer t = new StringTokenizer(line, "|");
//		String s = t.nextToken().trim();
//		if(s.equals(END_OF_FILE) || t.countTokens() != 2) return false;
//		name = s;
//		hours = new Integer(t.nextToken().trim()).intValue();
//		payrate = new Integer(t.nextToken().trim()).intValue();
//		return true;
//	}
  
  /** getNextRecord  attempts to read a new payroll record.
    * @return whether another record was read and is ready to process */
  public boolean getNextRecord()
  { boolean result = false;
    name = null;
    hours = -1;
    payrate = -0.1;
    try { if ( infile.ready() )
             { String line = infile.readLine();
               StringTokenizer t = new StringTokenizer(line, "|");
               String s = t.nextToken().trim();
                    if ( ! s.equals(END_OF_FILE) )    // finished?
                       { if ( t.countTokens() == 2 )  // hours and payrate?
                            { name = s;
                              hours = new Integer(t.nextToken().trim()).intValue();
                              payrate = new Double(t.nextToken().trim()).doubleValue();
                              result = true;
                            }
                         else { throw new RuntimeException(line); }
                       }
             }
        }
     catch (IOException e)
           { System.out.println("PayrollReader error: " + e.getMessage()); }
     catch (RuntimeException e)
           { System.out.println("PayrollReader error: bad record format: "
                                 + e.getMessage() + "  Skipping record");
             result = getNextRecord();  // try again
           }
    return result;
  }

  public String nameOf() { return name; }

  public int hoursOf() { return hours; }

  public double payrateOf() { return payrate; }


  public void close()
  { try { infile.close(); }
    catch (IOException e)
          { System.out.println("PayrollReader warning: file close failed"); }
  }
}