/* This is an imcomplete program!!! */

/** MortgagePaymentCalculator makes mortgage payments */
public class MortgagePaymentCalculator
{ private BankAccountSpecification bank_account; 
          // holds the address of an object that implements
		  // the BankAccountSpecification

  /** Constructor MortgagePaymentCalculator initializes the calculator.
    * @param account - the address of the bank account from which
	*                  we make deposits and withdrawals. */
  public MortgagePaymentCalculator(BankAccountSpecification account)
	{ bank_account = account; }
  
  ...

  /** makeMortgagePayment makes a mortgage payment from the bank account.
    * @param amount - the amount of the mortgage payment */
  public void makeMortgagePayment(int amount)
	{ boolean ok = bank_account.withdraw(amount);
      if (ok)
		{System.out.println("Payment made: " + amount); }
	  else { ... }
	}
}
