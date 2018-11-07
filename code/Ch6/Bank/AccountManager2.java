/** AccountManager2 maintains two bank accounts. */
public class AccountManager2
{ public static void main(String[] args)
  { BankReader reader = new BankReader();
    // create the models and their views:
    BankAccount primary_account = new BankAccount(0);
    BankWriter primary_writer = new BankWriter("Primary Account", primary_account);
    BankAccount secondary_account = new BankAccount(0);
    BankWriter secondary_writer = new BankWriter("Secondary Account", secondary_account);
    // construct the comtroller and start it:
    AccountController2 controller =
               new AccountController2(reader, primary_account, primary_writer,  
		                              secondary_account, secondary_writer);
    controller.processTransactions();
  }
}