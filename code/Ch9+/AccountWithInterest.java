/** AccountWithInterest models an interest bearing checking account */
public class AccountWithInterest extends CheckingAccount
{ int minimum_balance;  // the amount required to generate an interest payment
  boolean eligible_for_interest;  // whether the account has maintained
                                  //  the minimum_balance for this time period

  /** AccountWithInterest  creates the account
    * @param required_minimum - the minimum balance that must be maintained
    *    to qualify for an interest payment
    * @param initial_amount - the starting balance */
  public AccountWithInterest(int required_minimum, int initial_balance)
  { super(initial_balance);
    minimum_balance = required_minimum;
    eligible_for_interest = (initial_balance > minimum_balance);
  }

  /** withdraw removes money from the account, if possible
    * @param amount - the amount to be removed
    * @return true, only if the balance is enough to make the withdrawal  */
  public boolean withdraw(int amount)
  { boolean ok = super.withdraw(amount);
    eligible_for_interest = eligible_for_interest    // is minimum maintained?
                            &&  balanceOf() > minimum_balance;
    return ok;
  }

  /** computeInterest deposits an interest payment, if the account qualifies
    * @param interest_rate - the rate of interest, e.g., 0.05 for 5%
    * @return whether the account qualified for an interest payment.  */
  public boolean computeInterest(double interest_rate)
  { boolean outcome = false;
    if ( eligible_for_interest )
       { int interest = (int)(balanceOf() * interest_rate);
         deposit(interest);
         outcome = true;
       }
    eligible_for_interest = (balanceOf() > minimum_balance);  // reset
    return outcome;
  }
}