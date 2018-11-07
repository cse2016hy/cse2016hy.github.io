import javax.swing.*;
/**  MakeChangeAgain2 calculates change in coins for a dollars-and-cents amount.
  *  Input: two numbers supplied at the command line:
  *         a dollar amount, a nonnegative integer;
  *         a cents amount, an integer between 0 and 99.
  *  Output: coins  */
public class MakeChangeAgain2
{ public static void main(String[] args)
  { boolean ok = true; // remembers whether input data is acceptable
    int dollars = new Integer(args[0]).intValue();
    int cents = new Integer(args[1]).intValue();
	if (dollars < 0)
	  { JOptionPane.showMessageDialog(null, "MakeChangeAgain error: negative dollors: " + dollars);
	    ok = false; // the error negates accceptability
	  }
	if (ok) // dollars are acceptable, so consider cents:
	  { if (cents < 0)
	      { JOptionPane.showMessageDialog(null, "MakeChangeAgain error: negative cents: " + cents);
	        ok = false;
		  }
		if (cents > 99)
		  { JOptionPane.showMessageDialog(null, "MakeChangeAgain error: bad cents: " + cents);
		    ok = false;
		  }
	  }
	if (ok) // dollars and cents are acceptable, so compute answer:
      { int money = (dollars * 100) + cents;
        System.out.println( "quarters = " + (money/25) );
	    money = money % 25;
		System.out.println( "dimes = " + (money/10) );
		money = money % 10;
		System.out.println( "nickels = " + (money/5) );
		money = money % 5;
		System.out.println( "pennies = " + money );
	  }
  }
}
