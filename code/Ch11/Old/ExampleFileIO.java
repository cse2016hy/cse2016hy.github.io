import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
/**
 * Class ExampleFileIO - write a description of the class here
 * 
 * @author: 
 * date: 
 */
public class ExampleFileIO {
    private static PrintWriter outfile;
    private static BufferedReader infile;
    public static void main(String[] args) throws IOException {
	LineReader reader = new LineReader(System.in);
	boolean nofile = true; 
	String fn = "", str="", first="", last="", zip="";
	StringTokenizer t; 
	while (nofile) {
		// invariant: have not yet received a proper file name
		try { 
			fn = reader.readString("Enter name of file to read:");
			infile = new BufferedReader(new FileReader(fn));
			nofile = false;  // this statement executes only if
            	       // the previous statement executed without an exception
		}
		catch (FileNotFoundException e) {
			System.out.println("file " + fn + " does not exist");
			System.out.println("Try again."); 
		}
        }
    System.out.println();
    System.out.println( "The program has located the file.");
    System.out.println("It can be used for reading input.");
    System.out.println("  ..."); 
	// Read the file and process the tokens and write them out
	outfile = new PrintWriter(new FileWriter(fn + ".out"));
	while (infile.ready()) {
		// invariant: Read and processed all strings read and have
		// one or more left to read.
		str = infile.readLine();
		t = new StringTokenizer(str, "|");
		if(t.countTokens() != 3) {
			JOptionPane.showMessageDialog
				(null, "Bad input line . . .", "Error Message", JOptionPane.INFORMATION_MESSAGE);}
		else {
			first = t.nextToken();
			last = t.nextToken();
			zip = t.nextToken();
			if (zip.compareTo("66505") > 0) {
				outfile.println(first + "|" + last + "|" + zip);}
		}
	}
	System.out.println("File read . . .");
	System.out.println("Closing infile  " + fn);
	infile.close();
	System.out.println("Closing outfile  " + fn + ".out");
	outfile.close();
    }
}
