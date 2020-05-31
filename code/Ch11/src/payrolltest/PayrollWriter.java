package payrolltest;

import java.io.*;

public class PayrollWriter {
	PrintWriter outfile;
	public PayrollWriter(String name) {
		try {
			outfile = new PrintWriter(new FileWriter(name));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void printCheck(String name, int amount) {
		outfile.println(name + ", " + amount);
	}
	  
	public void close() { 
		outfile.close();
	}
}
