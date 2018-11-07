import java.io.*;
/**  MakeChange2 calculates change for a dollars-and-cents amount.
  *  input: a dollars amount and a cents amount, both integers
  *  output: the listing of the needed coins  */
public class MakeChange2
{ public static void main(String[] args) throws IOException
  { BufferedReader keyboard
                 = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Type a dollars amount: ");  // print a partial line
    String dollars = keyboard.readLine(); // read one full line of typed input
    System.out.print("Type a cents amount: ");    // do it again....
    String cents = keyboard.readLine();
    int money = (100 * new Integer(dollars).intValue())
                  + new Integer(cents).intValue();
    // the remainder of the program stays the same:
    System.out.println( "quarters = " + (money/25) );
    money = money % 25;
    System.out.println( "dimes = " + (money/10) );
    money = money % 10;
    System.out.println( "nickels = " + (money/5) );
    money = money % 5;
    System.out.println( "pennies = " + money );
  }
}