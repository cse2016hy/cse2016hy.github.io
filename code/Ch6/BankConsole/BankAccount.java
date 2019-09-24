package BankConsole;

import javax.swing.*;
/** BankAccount manages a single bank account */
public class BankAccount
{ 
  public String account_name; 
  private int balance;  // the account's balance
                        // representation invariant:  balance >= 0  always!

  /** Constructor BankAccount initializes the account
    * @param initial_amount - the starting account balance, a nonnegative. */
  public BankAccount(String name, int initial_amount)
  { 
	account_name = name; 
	if (initial_amount >= 0)
         { balance = initial_amount; }
    else { balance = 0; }
  }

  /** deposit adds money to the account.
    * @param amount - the amount of money to be added, a nonnegative int
	* @return true, if the deposit was successful; false, otherwise */
  public boolean deposit(int amount)
  { boolean result = false;
    if (amount >= 0)
         { balance = balance + amount;
	       result = true;
	     }
    else { JOptionPane.showMessageDialog(null, "BankAccount error: bad deposit amount --- ignored"); 
	     }
	return result;
  }

  /* withdraw removes money from the account, if it is possible.
   * @param amount - the amount of money to be withdrawn, a nonnegative int
   * @return true, if the withdrawal was successful; false, otherwise */
  public boolean withdraw(int amount)
  { boolean result =false;
    if (amount < 0)
         { JOptionPane.showMessageDialog(null, "BankAccount error: bad withdrwal amount --- ignored");
         }
    else if ( amount > balance )
         { JOptionPane.showMessageDialog(null, "BankAccount error: withdrawal amount exceeds balance --- ignored");
         }
    else { balance = balance - amount;
           result = true;
         }
    return result;
  }

  /* getBalance reports the current account balance
   * @return the balance */
  public int getBalance()
  { return balance; }
}


