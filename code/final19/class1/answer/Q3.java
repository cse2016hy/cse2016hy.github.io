
public class Q3 {
	public static double string2double(String s) {
		// fill here!
		if (s == null) return -1;
		try {
			return Double.parseDouble(s);
		} catch (RuntimeException e) {
			return -2; 
		}
	}
	public static void main(String[] args) {
		System.out.println(string2double(null)); // -1.0
		System.out.println(string2double("abc")); // -2.0
		System.out.println(string2double("3.8")); // 3.8
	}
}

//class BankAccount {
//    private int balance;
//    private int last_access_year; 
//    public BankAccount(int initial_amount, int starting_year) {
//         if (initial_amount >= 0) balance = initial_amount;
//         else balance = 0;
//         last_access_year = starting_year;
//    }
//    public int getLastAccessYear() { return last_access_year; }
//    public int getBalance() { return balance; }
//    public boolean deposit(int amount, int transaction_year) {
//        if (amount < 0) return false;
//        else {
//             balance = balance + amount;
//             last_access_year = transaction_year;
//             return true; 
//        }
//    }
//}
//
//class BankManager {
//	private BankAccount[] accounts;
//	public BankManager(int initial_size) {
//		accounts = new BankAccount[initial_size];
//	}
//	public void addAccount(BankAccount account) {
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i] == null) {
//				accounts[i] = account; break;
//			}
//		}
//	}
//	public void deleteResting() {
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i] != null && accounts[i].getLastAccessYear() <= 2017)
//				accounts[i] = null;
//		}
//	}
//	public int countAccounts() {
//		int cnt = 0; 
//		for (int i = 0; i < accounts.length; i++) 
//			if (accounts[i] != null) cnt++;
//		return cnt;
//	}
//}


//public class Q3 {
//
//	public static void main(String[] args) {
//		BankManager bm = new BankManager(10);
//		BankAccount b1 = new BankAccount(0, 2017); 
//		BankAccount b2 = new BankAccount(0, 2011);
//		BankAccount b3 = new BankAccount(0, 2019); 
//		BankAccount b4 = new BankAccount(0, 2016); 
//		bm.addAccount(b1);
//		bm.addAccount(b2);
//		bm.addAccount(b3);
//		bm.addAccount(b4);
//		b2.deposit(100, 2019);
//		bm.deleteResting();
//		System.out.println(bm.countAccounts());
//
//	}
//
//}
