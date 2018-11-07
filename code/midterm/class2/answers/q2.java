import java.text.DecimalFormat;

class BankAccount // 계산
{
    private double balance;

    public BankAccount(double initial_amount) {
         if (initial_amount >= 0)
             balance = initial_amount;
         else
             balance = 0.0;
    }
    public double getBalance() { return balance; }
    public boolean deposit(double amount) {
        boolean result = false;
        if (amount < 0)
             System.out.println("invalid deposit amount");
        else {
             balance = balance + amount;
             result = true;
        }
        return result;
    }
    public boolean withdraw(double amount) {
        boolean result = false;
        if (amount < 0)
            System.out.println("invalid withdraw amount: " + amount);
        else {
            balance = balance - amount;
            result = true;
        }
        return result;
    }
}


class AccountController
{
    public BankAccount[] accounts;
    private double[][] transfer_info;
    public static final double interest_rate = 0.3 / 100.0;

    public AccountController (BankAccount[] accounts, double[][] transfer_info)
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


public class AccountManager {
    public static void main(String[] args) { 
        // 테스트 코드 예시: 
        int i,j;
        double[][] transfer_info = new double[10][10]; 
        BankAccount[] accounts = new BankAccount[10];
        for (i = 0; i < 10; i++) {
            accounts[i] = new BankAccount(100);
        }
        for (i = 0; i < 10; i++) {
          for (j = i; j < 10; j++) {
            if (i != j) {
              transfer_info[i][j] = 10;
            }
          }
        }
        AccountController ac = new AccountController(accounts, transfer_info);
        DecimalFormat format = new DecimalFormat("0.##");
        double[] balances = ac.computeBalancesAfterMonths(2);
        for (i = 0; i < 10; i++) {
            System.out.println("account[" + i + "]'s balance: " + format.format(balances[i]));
        }
        /* 다음이 출력: 
        account[0]'s balance: -79.67
        account[1]'s balance: -39.61
        account[2]'s balance: 0.45
        account[3]'s balance: 40.51
        account[4]'s balance: 80.57
        account[5]'s balance: 120.63
        account[6]'s balance: 160.69
        account[7]'s balance: 200.75
        account[8]'s balance: 240.81
        account[9]'s balance: 280.87
        */
    }   
}
