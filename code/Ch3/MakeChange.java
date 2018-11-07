/**  MakeChange calculates the change for a dollars-and-cents amount.
  *  input: two program arguments: a dollars amount and a cents amount
  *  output: the listing of the needed coins  */
public class MakeChange
{
  public static void main(String[] args)
  { String dollars = args[0]; 
    String cents = args[1];
    int money = (100 * new Integer(dollars).intValue())
             + new Integer(cents).intValue(); // the starting total, in cents
    System.out.println( "quarters = " + (money/25) );
    money = money % 25;
    System.out.println( "dimes = " + (money/10) );
    money = money % 10;
    System.out.println( "nickels = " + (money/5) );
    money = money % 5;
    System.out.println( "pennies = " + money ); }
}


