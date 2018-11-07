/** AccountController maintains the balance on a bank account. */
public class AccountController
{ // fields that remember the view and model objects:
  private BankReader reader;  // input-view
  private BankWriter writer;  // output-view
  private BankAccount account;  // model

  /** Constructor AccountController builds the controller
    * @param r - the input-view object
    * @param w - the output-view object
    * @param a - the model object  */
  public AccountController(BankReader r, BankWriter w, BankAccount a)
  { reader = r;
    account = a;
    writer = w;
  }

  /** processTransactions processes user commands until a Q is entered */
  public void processTransactions()
  { char command = reader.readCommand("Command (D,W,Q) and amount:");
    if (command == 'Q')  // quit?
         { }    // terminate method by doing nothing more
    else { if (command == 'D')  // deposit?
              { int amount = reader.readAmount();
                boolean ok = account.deposit(amount);
				if (ok)
				     { writer.showTransaction("Deposit of $", amount); }
                else { writer.showTransaction("Deposit invalid ", amount); }
			  }
           else if (command == 'W')  // withdraw?
              { int amount = reader.readAmount();
                boolean ok = account.withdraw(amount);
                if (ok)
                     { writer.showTransaction("Withdrawal of $", amount); }
                else { writer.showTransaction("Withdrawal invalid ", amount); }
              }
           else { writer.showTransaction("Illegal command: " + command); }
           this.processTransactions();   // send message to self to repeat
    	 }
  }
}