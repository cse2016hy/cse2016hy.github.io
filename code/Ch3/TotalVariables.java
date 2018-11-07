/** TotalVariables computes the amount of change I have,
  * based on the values named by the four variables,
  * quarters, dimes, nickels, and pennies. */
public class TotalVariables
{ public static void main(String[] args)
  { int quarters = 9;
    int dimes = 2;
    int nickels = 0;
    int pennies = 6;
    System.out.println("For these quantities of coins:");
    System.out.print("Quarters = "); System.out.println(quarters);
    System.out.print("Dimes = "); System.out.println(dimes);
    System.out.print("Nickels = "); System.out.println(nickels);
    System.out.print("Pennies = "); System.out.println(pennies);
    System.out.print("The total is ");
    System.out.println((quarters*25)+(dimes*10)+(nickels*5)+(pennies*1) );
  }
} 
