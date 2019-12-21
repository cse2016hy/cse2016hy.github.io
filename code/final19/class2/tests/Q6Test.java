import static org.junit.Assert.*;

import org.junit.Test;

class BankManagerAnswer {
	// fill here!
	private BankAccount[] accounts;
	public BankManagerAnswer(int initial_size) {
		accounts = new BankAccount[initial_size];
	}
	public void addAccount(BankAccount account) {
		int i;
		for (i = 0; i < accounts.length; i++) 
			if (accounts[i] == null) {
				accounts[i] = account; 
				break;
			}
		if (i == accounts.length) {
			BankAccount[] accounts_new = new BankAccount[accounts.length * 2];
			for (i = 0; i < accounts.length; i++) 
				accounts_new[i] = accounts[i];
			accounts_new[i] = account;
			accounts = accounts_new;
		}
	}
	public void takeMaintenanceFee() {
		for (int i = 0; i < accounts.length; i++) 
			if (accounts[i] != null) {
				boolean result = accounts[i].withdraw(1000);
				if (!result)
					accounts[i] = null;
			}	
	}
	public int countAccounts() {
		int cnt = 0; 
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) cnt++;
		}
		return cnt;
	}
}

public class Q6Test {

	@Test
	public void test1() {
		BankManager bm = new BankManager(10);
		BankAccount b1 = new BankAccount(100); 
		BankAccount b2 = new BankAccount(2000);
		BankAccount b3 = new BankAccount(3000); 
		BankAccount b4 = new BankAccount(4000); 
		bm.addAccount(b1); bm.addAccount(b2);
		bm.addAccount(b3); bm.addAccount(b4);
		bm.takeMaintenanceFee();
		assertTrue(bm.countAccounts() == 3);
	}
	
	@Test
	public void test2() {
		BankManager bm = new BankManager(1);
		BankAccount b1 = new BankAccount(100); 
		BankAccount b2 = new BankAccount(2000);
		BankAccount b3 = new BankAccount(3000); 
		BankAccount b4 = new BankAccount(4000); 
		bm.addAccount(b1); bm.addAccount(b2);
		bm.addAccount(b3); bm.addAccount(b4);
		bm.takeMaintenanceFee();
		bm.takeMaintenanceFee();
		bm.takeMaintenanceFee();
		assertTrue(bm.countAccounts() == 2);
	}
	
	@Test
	public void test3() {
		BankManager bm = new BankManager(1);
		BankAccount b1 = new BankAccount(100); 
		BankAccount b2 = new BankAccount(2000);
		BankAccount b3 = new BankAccount(2000); 
		BankAccount b4 = new BankAccount(2000); 
		bm.addAccount(b1); bm.addAccount(b2);
		bm.addAccount(b3); bm.addAccount(b4);
		bm.takeMaintenanceFee();
		bm.takeMaintenanceFee();
		bm.takeMaintenanceFee();
		assertTrue(bm.countAccounts() == 0);
	}
	
	@Test
	public void test4() {
		BankManager bm = new BankManager(100);
		BankAccount b1 = new BankAccount(0); 
		BankAccount b2 = new BankAccount(0);
		BankAccount b3 = new BankAccount(0); 
		BankAccount b4 = new BankAccount(1000); 
		bm.addAccount(b1); bm.addAccount(b2);
		bm.addAccount(b3); bm.addAccount(b4);
		bm.takeMaintenanceFee();
		assertTrue(bm.countAccounts() == 1);
	}
	
	@Test
	public void test5() {
		BankManager bm = new BankManager(1);
		BankAccount b1 = new BankAccount(0); 
		BankAccount b2 = new BankAccount(0);
		BankAccount b3 = new BankAccount(0); 
		BankAccount b4 = new BankAccount(1000); 
		bm.addAccount(b1); bm.addAccount(b2);
		bm.addAccount(b3); bm.addAccount(b4);
		bm.takeMaintenanceFee();
		assertTrue(bm.countAccounts() == 1);
	}


}
