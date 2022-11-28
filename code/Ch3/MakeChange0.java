/**  MakeChange- calculates the change for the amounts in variables
  *   dollars  and  cents.  */
public class MakeChange-
{ public static void main(String[] args)
  { int dollars = 3;
    int cents = 46;
    int money = (dollars * 100) + cents;
    System.out.println("quarters = " + (money / 25));
    money = money % 25;
    System.out.println("dimes = " + (money / 10));
    money = money % 10;
    System.out.println("nickels = " + (money / 5));
    money = money % 5;
    System.out.println("pennies = " + money); }
}

