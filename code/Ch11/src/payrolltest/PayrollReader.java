package payrolltest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PayrollReader {
	private BufferedReader infile;  // the address of the input file
	private String EOF = "!";
	  // the name, hours, and payrate of the most recently read record:
	private String name;
	private int hours;
	private int payrate;
	public PayrollReader(String file_name) {
		try {
			infile = new BufferedReader(new FileReader(file_name));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String nameOf() { return name; }
	public int hoursOf() { return hours; }
	public int payrateOf() { return payrate; }
	public void close() {
		try {
			infile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean getNextRecord() {
		// Fred Mertz|31|20
		// ! 
		try {
			if (!infile.ready()) return false;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line = "";
		try {
			line = infile.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringTokenizer t = new StringTokenizer(line, "|");
		String s = t.nextToken().trim();
		if (!s.equals(EOF) && t.countTokens() == 2) {
			name = s;
			hours = new Integer(t.nextToken().trim()).intValue();
			payrate = new Integer(t.nextToken().trim()).intValue();
			return true;
		}
		else {
			return false;
			// result = getNextRecord();
		}
	}
  
}
