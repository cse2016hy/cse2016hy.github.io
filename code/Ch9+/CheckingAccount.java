/** CheckingAccount is a basic account from which withdrawals can be made */
public class CheckingAccount extends BasicAccount
{
  /** CheckingAccount creates the account
    * @param initial_amount - the starting balance */
  public CheckingAccount(int initial_amount)
  { super(initial_amount); }

  /** withdraw removes money from the account, if possible
    * @param amount - the amount to be removed
    * @return true, only if the balance is enough to make the withdrawal  */
  public boolean withdraw(int amount)
  { boolean outcome = false;
    if ( amount <= balance )
       { balance = balance - amount;
         outcome = true;
       }
    return outcome;
  }
}