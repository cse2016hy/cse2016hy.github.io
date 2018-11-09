/** BankAccount manages a single bank account; as stated in its
  * header line, it _implements_ the BankAccountSpecification: */
public class BasicAccount implements BankAccountSpecification
{ protected int balance;  // the account's balance

  /** Constructor BankAccount initializes the account */
  public BasicAccount()
  { balance = 0; }

  public BasicAccount(int initial_amount)
  { balance = initial_amount; }
  
  // Notice that methods deposit and withdraw match the same-named
  // methods in interface BankAccountSpecification:

  public void deposit(int amount)
    { balance = balance + amount; }

  public boolean withdraw(int amount)
	{ boolean result = false;
      if ( amount <= balance )
         { balance = balance - amount; 
	       result = true;
         }
      return result;
    }

  /** getBalance reports the current account balance
    * @return the balance  */
  public int getBalance()
  { return balance; }
}

