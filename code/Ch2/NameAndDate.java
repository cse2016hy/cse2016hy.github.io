
import java.util.*;
/** NameAndDate prints my name and the exact date and time. */
public class NameAndDate
{ public static void main(String[] args)
  { 
	GregorianCalendar c = new GregorianCalendar(); 
	System.out.print("Hanyang ERICA --- ");  // this prints a partial line
    // The following creates an object that tells us the time, which we print:
    System.out.println( c.getTime() );  
    System.out.println();                // this prints a blank line
    System.out.println("Finished.");
  }
}

