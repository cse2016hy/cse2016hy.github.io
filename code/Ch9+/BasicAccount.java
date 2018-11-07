** BasicAccount is a bank account that holds money */
public class BasicAccount
{ protected int balance;  // the money;  note the keyword,  ``protected''

  /** BasicAccount creates the account
    * @param initial_amount - the starting balance */
  public BasicAccount(int initial_amount)
  { balance = initial_amount; }

  /** deposit adds money to the account
    * @param amount - the amount to be deposited  */
  public void deposit(int amount)
  { if ( amount > 0 )
       { balance = balance + amount; }
  }

  /** balanceOf returns the current balance
    * @return the balance  */
  public int balanceOf()
  { return balance; }
}
