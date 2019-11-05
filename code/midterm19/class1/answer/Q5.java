
class Coins {
	public int quaters; // 25 cents
	public int dimes; // 10 cents
	public int nickels; // 5 cents
	public int pennies; // 1 cent
	
	public Coins(int initial_amount) {
		// initial_amount is given in cents
		if (initial_amount < 0) initial_amount = 0; 
		int money = initial_amount; 
		quaters = money / 25;
		money = money % 25; 
		dimes = money / 10;
		money = money % 10;
		nickels = money / 5;
		money = money % 5;
		pennies = money;
	}
	
	public Coins add(Coins other) {
		return new Coins(this.tocents() + other.tocents()); 
	}
	
	public int tocents() {
		return quaters * 25 + dimes * 10 + nickels * 5 + pennies; 
	}
}

class BankAccount 
{
    private Coins balance;

    public BankAccount(Coins initial_amount) {
         balance = initial_amount;
    }

    public Coins getBalance() {
        return balance;
    }

    public boolean deposit(Coins coins) {
    	int amount = coins.tocents();
        boolean result = false;
        if (amount < 0)
             System.out.println("invalid deposit amount");
         else {
             balance = balance.add(coins);
             result = true;
         }
         return result;
    }
}

public class Q5 {
  public static void main(String[] args) {
	Coins coins = new Coins(100); 
    BankAccount account = new BankAccount(coins);
    account.deposit(coins);
    System.out.println("balance = " + account.getBalance().tocents());
  }
}