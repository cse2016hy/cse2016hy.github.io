package BankConsole;
/** AccountManager2 maintains two bank accounts. */
public class AccountManager2
{ public static void main(String[] args)
  { BankReader reader = new BankReader();
    // create the models and their views:
    BankAccount primary_account = new BankAccount("Primary account", 0);
    BankWriter primary_writer = new BankWriter(primary_account);
    BankAccount secondary_account = new BankAccount("Secondary account", 0);
    BankWriter secondary_writer = new BankWriter(secondary_account);
    // construct the comtroller and start it:
    AccountController2 controller =
               new AccountController2(reader, primary_account, primary_writer,  
		                              secondary_account, secondary_writer);
    controller.processTransactions();
  }
}