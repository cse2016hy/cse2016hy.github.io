import java.io.*;
/** Output1  writes three lines of characters to file  test.txt  */
public class Output1
{ public static void main(String[] args) throws IOException
  { PrintWriter outfile = new PrintWriter(new FileWriter("test.txt"));
    outfile.println("Hello to   you!");
    outfile.print("How are"); 
    outfile.println(" you?");
    outfile.println("  " + (47+2));
    outfile.close();  
//    throw (new RuntimeException("error!"));
  }
}