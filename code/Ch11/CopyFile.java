import java.io.*;
/** CopyFile copies the contents of an input file, f,
  * whose name is supplied by the user, into an output file, f.out  */
public class CopyFile
{ public static void main(String[] args) throws IOException
  { DialogReader reader = new DialogReader();
    String f = reader.readString("Input filename, please: ");
	// construct the view object that reads from the input file:
    BufferedReader infile = new BufferedReader(new FileReader(f));
    // construct the view object that writes to the output file:
    PrintWriter outfile = new PrintWriter(new FileWriter(f + ".out"));
    while ( infile.ready() )   // are there more lines to read in infile?
          { String s = infile.readLine(); 
            outfile.println(s); 
          }
    infile.close(); 
    outfile.close(); 
  }
}