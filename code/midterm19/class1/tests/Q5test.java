import static org.junit.Assert.*;

import org.junit.Test;

class CoinsAnswer {
	public int quaters; // 25 cents
	public int dimes; // 10 cents
	public int nickels; // 5 cents
	public int pennies; // 1 cent
	
	public CoinsAnswer(int initial_amount) {
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
	
	public CoinsAnswer add(CoinsAnswer other) {
		return new CoinsAnswer(this.tocents() + other.tocents()); 
	}
	
	public int tocents() {
		return quaters * 25 + dimes * 10 + nickels * 5 + pennies; 
	}
}

class BankAccountAnswer 
{
    private CoinsAnswer balance;

    public BankAccountAnswer(CoinsAnswer initial_amount) {
         balance = initial_amount;
    }

    public CoinsAnswer getBalance() {
        return balance;
    }

    public boolean deposit(CoinsAnswer coins) {
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

public class Q5test {

	@Test(timeout=1200000)
	public void test1() {
		int init = 0;
		Coins coins = new Coins(init); 
	    BankAccount account = new BankAccount(coins);
	    account.deposit(coins);
	    CoinsAnswer coinsa = new CoinsAnswer(init); 
	    BankAccountAnswer accounta = new BankAccountAnswer(coinsa);
	    accounta.deposit(coinsa);
	    Coins result_coins = account.getBalance();
	    CoinsAnswer result_coinsa = accounta.getBalance();
	    assertTrue(result_coins.quaters == result_coinsa.quaters);
	    assertTrue(result_coins.dimes == result_coinsa.dimes);
	    assertTrue(result_coins.nickels == result_coinsa.nickels);
	    assertTrue(result_coins.pennies == result_coinsa.pennies);
	}
	
	@Test(timeout=1200000)
	public void test2() {
		int init = 1000;
		Coins coins = new Coins(init); 
	    BankAccount account = new BankAccount(coins);
	    account.deposit(coins);
	    CoinsAnswer coinsa = new CoinsAnswer(init); 
	    BankAccountAnswer accounta = new BankAccountAnswer(coinsa);
	    accounta.deposit(coinsa);
	    Coins result_coins = account.getBalance();
	    CoinsAnswer result_coinsa = accounta.getBalance();
	    assertTrue(result_coins.quaters == result_coinsa.quaters);
	    assertTrue(result_coins.dimes == result_coinsa.dimes);
	    assertTrue(result_coins.nickels == result_coinsa.nickels);
	    assertTrue(result_coins.pennies == result_coinsa.pennies);
	}
	
	@Test(timeout=1200000)
	public void test3() {
		int init = -1;
		Coins coins = new Coins(init); 
	    BankAccount account = new BankAccount(coins);
	    account.deposit(coins);
	    CoinsAnswer coinsa = new CoinsAnswer(init); 
	    BankAccountAnswer accounta = new BankAccountAnswer(coinsa);
	    accounta.deposit(coinsa);
	    Coins result_coins = account.getBalance();
	    CoinsAnswer result_coinsa = accounta.getBalance();
	    assertTrue(result_coins.quaters == result_coinsa.quaters);
	    assertTrue(result_coins.dimes == result_coinsa.dimes);
	    assertTrue(result_coins.nickels == result_coinsa.nickels);
	    assertTrue(result_coins.pennies == result_coinsa.pennies);
	}
	
	@Test(timeout=1200000)
	public void test4() {
		int init = 100;
		Coins coins = new Coins(init); 
	    BankAccount account = new BankAccount(coins);
	    account.deposit(new Coins(1000));
	    CoinsAnswer coinsa = new CoinsAnswer(init); 
	    BankAccountAnswer accounta = new BankAccountAnswer(coinsa);
	    accounta.deposit(new CoinsAnswer(1000));
	    Coins result_coins = account.getBalance();
	    CoinsAnswer result_coinsa = accounta.getBalance();
	    assertTrue(result_coins.quaters == result_coinsa.quaters);
	    assertTrue(result_coins.dimes == result_coinsa.dimes);
	    assertTrue(result_coins.nickels == result_coinsa.nickels);
	    assertTrue(result_coins.pennies == result_coinsa.pennies);
	}

	@Test(timeout=1200000)
	public void test5() {
		int init = 100;
		Coins coins = new Coins(init); 
	    BankAccount account = new BankAccount(coins);
	    account.deposit(new Coins(-1));
	    CoinsAnswer coinsa = new CoinsAnswer(init); 
	    BankAccountAnswer accounta = new BankAccountAnswer(coinsa);
	    accounta.deposit(new CoinsAnswer(-1));
	    Coins result_coins = account.getBalance();
	    CoinsAnswer result_coinsa = accounta.getBalance();
	    assertTrue(result_coins.quaters == result_coinsa.quaters);
	    assertTrue(result_coins.dimes == result_coinsa.dimes);
	    assertTrue(result_coins.nickels == result_coinsa.nickels);
	    assertTrue(result_coins.pennies == result_coinsa.pennies);
	}


}
