
import java.util.*;
/** NameAndDate prints my name and the exact date and time. */
public class NameAndDate
{ public static void main(String[] args)
  { System.out.print("Fred Mertz --- ");  // this prints a partial line
    // The following creates an object that tells us the time, which we print:
    System.out.println( new GregorianCalendar().getTime() );  
    System.out.println();                // this prints a blank line
    System.out.println("Finished.");
  }
}

