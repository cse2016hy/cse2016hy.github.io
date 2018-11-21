package payroll;

import java.io.*;

public class PayrollWriter
{
  PrintWriter outfile;
  public PayrollWriter(String name) { 
	try { outfile = new PrintWriter(new FileWriter(name)); }
    catch (Exception e)
      { System.out.println("PayrollWriter error: bad file name: "
                           + name + "   Aborting!");
        throw new RuntimeException(e.toString());
      }
  }

  public void printCheck(String name, double amount) {
	  outfile.println(name + " " + amount);
	  System.out.println(name + " " + amount);
  }
  

  public void close() { 
	outfile.close();
  }
}

