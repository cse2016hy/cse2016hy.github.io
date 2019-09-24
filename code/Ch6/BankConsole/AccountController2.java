package BankConsole;
/** AccountController2 maintains the balance of two bank accounts,
  * a primary account and a secondary account.
  * inputs: P (use primary account), S (use secondary account)
  * inputs: D dd.cc (deposit), W dd.cc (withdraw), Q (quit)
  * outputs: the transactions displayed on two windows */
public class AccountController2
{ private BankReader reader; // input view

  // primary bank account: model and its output-view:
  private BankAccount primary_account;
  private BankWriter primary_writer;
  // secondary bank account: model and its output-view:
  private BankAccount secondary_account; 
  private BankWriter secondary_writer;

  // fields that remember which model and view are active for transactions:
  private BankAccount account; 
  private BankWriter writer; 
  // invariant: these fields must be the primary or secondary account's

  /** Constructor AccountController2 initializes the bank accounts */
  public AccountController2(BankReader r, BankAccount a1, BankWriter w1,
				                    	  BankAccount a2, BankWriter w2)
  { reader = r;
    primary_account = a1;
    primary_writer = w1;
    secondary_account = a2;
    secondary_writer = w2;
    // start processing with the primary account
    account = secondary_account;
    writer = secondary_writer;
  }

  /** resetAccount changes the current account to new_account and new_writer */
  private void resetAccount(BankAccount new_account, BankWriter new_writer)
  { writer.showTransaction("Inactive");  // deactivate current account
    account = new_account;        // reset the account to the new one
    writer = new_writer;
    writer.showTransaction("Active");
  }

  /** processTransactions receives user commands until a Q is entered */
  public void processTransactions()
  { char command = reader.readCommand("Command (P,S,D,W,Q):");
    if (command == 'Q')  // quit?
         { }  
    else { if (command == 'D')  // deposit?
              { int amount = reader.readAmount();
                account.deposit(amount);
                writer.showTransaction("Deposit of $", amount);
              }
           else if (command == 'W')  // withdraw?
              { int amount = reader.readAmount();
                boolean ok = account.withdraw(amount);
                if ( ok )
                     { writer.showTransaction("Withdrawal of $", amount); }
                else { writer.showTransaction("Withdrawal invalid ", amount); }
              }
           else if (command == 'P') // work with primary account?
	          { resetAccount(primary_account, primary_writer); }
           else if (command == 'S') // work with secondary account?
	          { resetAccount(secondary_account, secondary_writer); }
           else { writer.showTransaction("Illegal command: " + command); }
           processTransactions();   // send message to self to repeat
	     }
  }
}