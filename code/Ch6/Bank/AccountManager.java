/** AccountManager starts the application that maintains a bank account.
  * Inputs: a series of commands of the forms,
  *   D dd.cc  (deposit),
  *   W dd.cc  (withdraw), or
  *   Q        (quit), where dd.cc is a dollars-cents amount
  * Outputs: a display of the results of the transactions */
public class AccountManager
{ public static void main(String[] args)
  { // create the application's objects:
    BankReader reader = new BankReader();
    BankAccount account = new BankAccount(0);
    BankWriter writer = new BankWriter("BankWriter", account);
    AccountController controller =
               new AccountController(reader, writer, account);
    // start the controller:
    controller.processTransactions();
  }
}