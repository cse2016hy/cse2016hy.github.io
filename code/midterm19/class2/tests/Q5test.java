import static org.junit.Assert.*;

import org.junit.Test;

class CurrencyAnswer {
	private double dollars;
	private double won;
 	private double yen;
	
	public CurrencyAnswer(double initial_amount) {
		// initial_amount is given in cents 
		// fill here! 
		if (initial_amount <= 0) won = 0; 
		else won = initial_amount;
		
		dollars = won / 1000.0; 
		yen = won / 10.0; 
	}
	
	public CurrencyAnswer add(CurrencyAnswer other) {
		// fill here!
		return new CurrencyAnswer(this.won + other.getWon()); 
	}
	
	public double getDollars() {
		// fill here!
		return dollars; 
	}
	public double getWon() {
		// fill here!
		return won;
	}
	public double getYen() {
		// fill here!
		return yen; 
	}
}

class BankAccountAnswer 
{
    private CurrencyAnswer balance;

    public BankAccountAnswer(CurrencyAnswer initial_amount) {
    	// fill here!
         balance = initial_amount;
    }

    public CurrencyAnswer getBalance() {
    	// fill here!
        return balance;
    }

    public boolean deposit(CurrencyAnswer money) {
    	// fill here!
    	double amount = money.getWon();
        boolean result = false;
        if (amount < 0)
             System.out.println("invalid deposit amount");
         else {
             balance = balance.add(money);
             result = true;
         }
         return result;
    }
}


public class Q5test {

	@Test(timeout=5000)
	public void test1() {
		int init = 0;
		Currency money = new Currency(init); 
	    BankAccount account = new BankAccount(money);
	    account.deposit(money);
	    CurrencyAnswer moneya = new CurrencyAnswer(init); 
	    BankAccountAnswer accounta = new BankAccountAnswer(moneya);
	    accounta.deposit(moneya);
	    Currency result_money = account.getBalance();
	    CurrencyAnswer result_moneya = accounta.getBalance();
	    assertTrue(result_money.getDollars() == result_moneya.getDollars());
	    assertTrue(result_money.getWon() == result_moneya.getWon());
	    assertTrue(result_money.getYen() == result_moneya.getYen());
	}
	
	@Test(timeout=5000)
	public void test2() {
		int init = 1000;
		Currency money = new Currency(init); 
	    BankAccount account = new BankAccount(money);
	    account.deposit(money);
	    CurrencyAnswer moneya = new CurrencyAnswer(init); 
	    BankAccountAnswer accounta = new BankAccountAnswer(moneya);
	    accounta.deposit(moneya);
	    Currency result_money = account.getBalance();
	    CurrencyAnswer result_moneya = accounta.getBalance();
	    assertTrue(result_money.getDollars() == result_moneya.getDollars());
	    assertTrue(result_money.getWon() == result_moneya.getWon());
	    assertTrue(result_money.getYen() == result_moneya.getYen());
	}
	
	@Test(timeout=5000)
	public void test3() {
		int init = -1;
		Currency money = new Currency(init); 
	    BankAccount account = new BankAccount(money);
	    account.deposit(money);
	    CurrencyAnswer moneya = new CurrencyAnswer(init); 
	    BankAccountAnswer accounta = new BankAccountAnswer(moneya);
	    accounta.deposit(moneya);
	    Currency result_money = account.getBalance();
	    CurrencyAnswer result_moneya = accounta.getBalance();
	    assertTrue(result_money.getDollars() == result_moneya.getDollars());
	    assertTrue(result_money.getWon() == result_moneya.getWon());
	    assertTrue(result_money.getYen() == result_moneya.getYen());
	}
	
	@Test(timeout=5000)
	public void test4() {
		int init = 100;
		Currency money = new Currency(init); 
	    BankAccount account = new BankAccount(money);
	    account.deposit(new Currency(1000));
	    CurrencyAnswer moneya = new CurrencyAnswer(init); 
	    BankAccountAnswer accounta = new BankAccountAnswer(moneya);
	    accounta.deposit(new CurrencyAnswer(1000));
	    Currency result_money = account.getBalance();
	    CurrencyAnswer result_moneya = accounta.getBalance();
	    assertTrue(result_money.getDollars() == result_moneya.getDollars());
	    assertTrue(result_money.getWon() == result_moneya.getWon());
	    assertTrue(result_money.getYen() == result_moneya.getYen());
	}

	@Test(timeout=5000)
	public void test5() {
		int init = 100;
		Currency money = new Currency(init); 
	    BankAccount account = new BankAccount(money);
	    account.deposit(new Currency(-1));
	    CurrencyAnswer moneya = new CurrencyAnswer(init); 
	    BankAccountAnswer accounta = new BankAccountAnswer(moneya);
	    accounta.deposit(new CurrencyAnswer(-1));
	    Currency result_money = account.getBalance();
	    CurrencyAnswer result_moneya = accounta.getBalance();
	    assertTrue(result_money.getDollars() == result_moneya.getDollars());
	    assertTrue(result_money.getWon() == result_moneya.getWon());
	    assertTrue(result_money.getYen() == result_moneya.getYen());
	}

}
