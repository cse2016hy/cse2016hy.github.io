import javax.swing.*;
/**  MakeChangeAgain calculates change in coins for a dollars-and-cents amount.
  *  Input: two numbers supplied at the command line:
  *         a dollar amount, a nonnegative integer;
  *         a cents amount, an integer between 0 and 99.
  *  Output: coins  */
public class MakeChangeAgain
{ 
  public static void main(String[] args)
  { 
	String s = JOptionPane.showInputDialog("Type dollars, an integer:"); 
	int dollars = Integer.parseInt(s);
    if (dollars < 0)
	  { 
    	JOptionPane.showMessageDialog(null, "MakeChangeAgain error: negative dollors: " + dollars);
	    throw new RuntimeException("MakeChangeAgain error: negative dollors: " + dollars);
	  }
	else // dollars amount is acceptable, so process cents amount:
	  { 
		s = JOptionPane.showInputDialog("Type cents, an integer:");
		int cents = Integer.parseInt(s);
	    if (cents < 0)
	      { JOptionPane.showMessageDialog(null, "MakeChangeAgain error: negative cents: " + cents);
	      }
		else
		  { if (cents > 99)
		      { JOptionPane.showMessageDialog(null, "MakeChangeAgain error: bad cents: " + cents);
		      }
			else // dollars and cents are acceptable, so compute answer:
			  { 
				int money = (dollars * 100) + cents;
				String output; 
                output = " quarters = " + (money/25);
				money = money % 25;
				output = output + "\n dimes = " + (money/10);
				money = money % 10;
				output = output + "\n nickels = " + (money/5);
				money = money % 5;
				output = output + "\n pennies = " + money;
				JOptionPane.showMessageDialog(null, output);
			  }
		  }
	  }
  }
}

