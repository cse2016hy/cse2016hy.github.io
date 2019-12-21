import static org.junit.Assert.*;

import org.junit.Test;

public class Q3Test {
	public static double string2doubleAnswer(String s) {
		// fill here!
		if (s == null) return -1;
		try {
			return Double.parseDouble(s);
		} catch (RuntimeException e) {
			return -2; 
		}
	}
	@Test
	public void test1() {
		String s = "";
		assertTrue(Q3.string2double(s) == string2doubleAnswer(s));
	}
	
	@Test
	public void test2() {
		String s = null;
		assertTrue(Q3.string2double(s) == string2doubleAnswer(s));
	}
	
	@Test
	public void test3() {
		String s = "-1.02";
		assertTrue(Q3.string2double(s) == string2doubleAnswer(s));
	}

	@Test
	public void test4() {
		String s = "a+1.02";
		assertTrue(Q3.string2double(s) == string2doubleAnswer(s));
	}
	
	@Test
	public void test5() {
		String s = "1324.2949";
		assertTrue(Q3.string2double(s) == string2doubleAnswer(s));
	}
}
//class BankAccountAnswer {
//    private int balance;
//    private int last_access_year; 
//    public BankAccountAnswer(int initial_amount, int starting_year) {
//         if (initial_amount >= 0)
//             balance = initial_amount;
//         else
//             balance = 0;
//         last_access_year = starting_year;
//    }
//    public int getLastAccessYear() { return last_access_year; }
//    public int getBalance() { return balance; }
//
//    public boolean deposit(int amount, int transaction_year) {
//        if (amount < 0) {
//        	System.out.println("invalid deposit amount");
//        	return false; 
//        }    
//        else {
//             balance = balance + amount;
//             last_access_year = transaction_year;
//             return true; 
//        }
//    }
//}
//
//class BankManagerAnswer {
//	private BankAccountAnswer[] accounts;
//	
//	public BankManagerAnswer(int initial_size) {
//		accounts = new BankAccountAnswer[initial_size];
//	}
//	
//	public void addAccount(BankAccountAnswer account) {
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i] == null) {
//				accounts[i] = account;
//				break;
//			}
//		}
//	}
//	
//	public void deleteResting() {
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i] != null && accounts[i].getLastAccessYear() <= 2017)
//				accounts[i] = null;
//		}
//	}
//	public int countAccounts() {
//		int cnt = 0; 
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i] != null) {
//				cnt++;
//			}
//		}
//		return cnt;
//	}	
//}


