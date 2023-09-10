import java.util.GregorianCalendar;

import javax.swing.JOptionPane;


/** ConvertHours translates a time in hours into its equivalent in seconds.
  *  Input: a nonnegative integer
  *  Output: the converted time into seconds.  */
public class ConvertHours
{ 
public static void main(String[] args)
  { 
	//"24"
	String s = null;
	
	System.out.println(s.charAt(0));
	
	// 24
	int hours = Integer.parseInt(s); // new Integer(s).intValue();
    if ( hours >= 0 )
         { // at this point, hours is nonnegative, so compute seconds:
           int seconds = hours * 60 * 60;
           JOptionPane.showMessageDialog(null,
                   hours + " hours is " + seconds + " seconds");
         }
    else { // at this point, hours must be negative, an error:
           JOptionPane.showMessageDialog(null,
                   "ConvertHours error: negative input " + hours);
         }
    System.exit(0);
  }
}
