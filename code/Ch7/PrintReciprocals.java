import javax.swing.*;
/** PrintReciprocals computes the reciprocals of its input integers.
  * Inputs: a sequence of nonnegative integers, terminated by a negative.
  * Outputs: a sequence of the integers and their reciprocals. */ 
public class PrintReciprocals
{ public static void main(String[] args) 
  { boolean processing = true;
    while ( processing )
      // invariant: so far, all reciprocals of inputs correctly computed
	  { int input = new Integer(JOptionPane.showInputDialog
		                ("Type a nonnegative integer:")).intValue();
	    if (input < 0)
	         { processing = false; } // stop loop when input is negative
        else { int square = input * input;
		       JOptionPane.showMessageDialog(null, "1/" + input + " = " + (1.0/input));
		     }
	  } 
	System.out.println("Finished");
  }
}
