package BankConsole;

import java.text.*;

import javax.swing.JOptionPane;
/** BankWriter writes bank transactions */
public class BankWriter
{ 
  private BankAccount bank;  // the address of the bank account displayed
  private String last_transaction = ""; // the transaction that is displayed

  /** Constructor BankAccount initializes the writer
    * @param title - the title bar's text
    * @param b - the (address of) the bank account displayed by the Writer */
  public BankWriter(BankAccount b)
  { bank = b;
  }

  /** unconvert reformats a cents amount into a dollars,cents string */
  private String unconvert(int i)
  { double dollars_cents = i / 100.00;
    return new DecimalFormat("0.00").format(dollars_cents); 
  }

  /** showTransaction displays the result of a monetary bank transation
    * @param message - the transaction
    * @param amount - the amount of the transaction */
  public void showTransaction(String message, int amount)
  { last_transaction = message + " " + unconvert(amount);
  	System.out.println(bank.account_name + ": " + last_transaction);
  	System.out.println("Current balance = $" + unconvert(bank.getBalance()));
  }

  /** showTransaction displays the result of a bank transation
    * @param message - the transaction */
  public void showTransaction(String message)
  { last_transaction = message;
  System.out.println(bank.account_name + ": " + last_transaction);
  }
}