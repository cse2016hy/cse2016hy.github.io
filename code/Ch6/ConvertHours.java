import javax.swing.*;
/** ConvertHours translates a time in hours into its equivalent in seconds.
  *  Input: a nonnegative integer
  *  Output: the converted time into seconds.  */
public class ConvertHours
{ 
public static void main(String[] args)
  { 
	String s = JOptionPane.showInputDialog("Type hours, an integer:"); 
	int hours = Integer.parseInt(s);
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
