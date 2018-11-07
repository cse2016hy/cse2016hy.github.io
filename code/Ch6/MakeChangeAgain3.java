import javax.swing.*;
/**  MakeChangeAgain3 calculates change in coins for a dollars-and-cents amount.
  *  Input: two numbers supplied at the command line:
  *         a dollar amount, a nonnegative integer;
  *         a cents amount, an integer between 0 and 99.
  *  Output: the coins  */
public class MakeChangeAgain3
{ public static void main(String[] args)
  { int dollars = new Integer(args[0]).intValue();
    int cents = new Integer(args[1]).intValue();
	if (dollars < 0 || cents < 0 || cents > 99)
	  { JOptionPane.showMessageDialog(null, "MakeChangeAgain error: bad inputs: " + dollars + " " + cents); }
	else // dollars and cents are acceptable, so compute answer:
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