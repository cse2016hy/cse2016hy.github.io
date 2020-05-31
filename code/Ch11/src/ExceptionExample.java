import java.io.*;

public class ExceptionExample { 
	public ExceptionExample() { } 
	public static void f() { 
		try 
		{ g(); } 
		catch (RuntimeException e) { System.out.println("caught at f: " + e.getMessage()); } 
		System.out.println("f completes"); 
	} 
	public static void g() { 	
		try { 
			PrintWriter outfile = new PrintWriter(new FileWriter("text.out")); 
			try { outfile.println( h() ); } 
			catch (NullPointerException e) { System.out.println("null pointer caught at g"); }
		} 
		catch (IOException e) { System.out.println("io error caught at g"); } 
		System.out.println("g completes"); 
	} 
	private static int h() { 
		int[] r = new int[2]; 
    	return r[3]; 
	}
	public static void main(String[] args) {
		f();
	}
}