
class AccountControllerAnswer
{
    public BankAccount[] accounts;
    private double[][] transfer_info;
  public static final double interest_rate = 0.3 / 100.0;
    
    public AccountControllerAnswer (BankAccount[] accounts, double[][] transfer_info)
    {
        BankAccount[] accounts_copy = new BankAccount[accounts.length];
      for (int i = 0; i < accounts.length; i++)
        if (accounts[i] != null)
          accounts_copy[i] = new BankAccount(accounts[i].getBalance());
        this.accounts = accounts_copy;
        this.transfer_info = transfer_info;
    }

    public double[] computeBalancesAfterMonths(int month)
    {
        int n_accounts = accounts.length;
        int i, j, k;
        
        for (k = 0; k < month; k++) {
          // deposit interests 
          for (i = 0; i < n_accounts; i++) {
              double current_balance = accounts[i].getBalance();
                if (current_balance < 0.0) accounts[i].withdraw(-1 * current_balance * interest_rate);
                else accounts[i].deposit(current_balance * interest_rate);
          }
          // transfer
          for (i = 0; i < n_accounts; i++) {
            for (j = 0; j < n_accounts; j++) {
            accounts[i].withdraw(transfer_info[i][j]);
              accounts[j].deposit(transfer_info[i][j]);
              }
            }
        }
        return getBalances();
    }
    
    public double[] getBalances() {
      double[] balances = new double[accounts.length];
      int i;
      for (i = 0; i < accounts.length; i++) {
        balances[i] = accounts[i].getBalance();
      }
      return balances;
    }
}

public class Q2test {
    public static final double e = 0.01;
    public void test(int month, BankAccount[] accounts, double[][] transfer_info) {
        AccountController ac = new AccountController(accounts, transfer_info);
        AccountControllerAnswer ac_answer = new AccountControllerAnswer(accounts, transfer_info);

        double[] balances = ac.computeBalancesAfterMonths(month);
        double[] balances_answer = ac_answer.computeBalancesAfterMonths(month);
        for (int i = 0; i < 10; i++) {
          assertTrue(Math.abs(balances[i] - balances_answer[i]) <= e);
        }
    }
    @Test(timeout=5000)
    public void test1() {
        int month = 10;
        int i,j;
        double[][] transfer_info = new double[10][10]; 
        BankAccount[] accounts = new BankAccount[10];
        for (i = 0; i < 10; i++) accounts[i] = new BankAccount(0);
        for (i = 0; i < 5; i++) {
          for (j = 0; j < 10; j++) {
            if (i != j) {
              transfer_info[i][j] = 10;
            }
          }
        }
        test(month, accounts, transfer_info);
    }
    @Test(timeout=5000)
    public void test2() {
      int month = 1;
        int i,j;
        double[][] transfer_info = new double[10][10]; 
        BankAccount[] accounts = new BankAccount[10];
        for (i = 0; i < 10; i++) accounts[i] = new BankAccount(100);
        for (i = 0; i < 10; i++) {
          for (j = 0; j < 5; j++) {
            if (i != j) {
              transfer_info[i][j] = 10;
            }
          }
        }
        test(month, accounts, transfer_info);
    }
    @Test(timeout=5000)
    public void test3() {
      int month = 3;
        int i,j;
        double[][] transfer_info = new double[10][10]; 
        BankAccount[] accounts = new BankAccount[10];
        for (i = 0; i < 10; i++) accounts[i] = new BankAccount(100);
        for (i = 0; i < 5; i++) {
          for (j = 0; j < 10; j++) {
            if (i != j) {
              transfer_info[i][j] = 10;
            }
          }
        }
        test(month, accounts, transfer_info);
    }
    @Test(timeout=5000)
    public void test4() {
      int month = 3;
        int i,j;
        double[][] transfer_info = new double[10][10]; 
        BankAccount[] accounts = new BankAccount[10];
        for (i = 0; i < 10; i++) accounts[i] = new BankAccount(100);
        for (i = 0; i < 10; i++) {
          for (j = 0; j < 5; j++) {
            if (i != j) {
              transfer_info[i][j] = 10;
            }
          }
        }
        test(month, accounts, transfer_info);
    }
    @Test(timeout=5000)
    public void test5() {
      int month = 10;
        int i,j;
        double[][] transfer_info = new double[10][10]; 
        BankAccount[] accounts = new BankAccount[10];
        for (i = 0; i < 10; i++) accounts[i] = new BankAccount(100);
        for (i = 0; i < 5; i++) {
          for (j = 5; j < 10; j++) {
            if (i != j) {
              transfer_info[i][j] = 1;
            }
          }
        }
        test(month, accounts, transfer_info);
    }
}
