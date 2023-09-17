
public class TotalVariablesDollars {

	public static void main(String[] args) {
		int quarters = 9;
	    int dimes = 2;
	    int nickels = 0;
	    int pennies = 6;
	    
	    
		int total = (quarters * 25) + (dimes * 10) + (nickels * 5) + (pennies * 1);
		System.out.print("The total is $");
		System.out.print(total / 100);
		System.out.print(".");
		System.out.println(total % 100);
	}

}
