/** Record models a bank account with an identification key */
public class Record
{ private int balance;  // the account's balance
  private Key id;       // the identification key

  /** Constructor Record initializes the account
    * @param initial_amount - the starting account balance, a nonnegative.
    * @param id - the account's identification key  */
  public Record(int initial_amount, Key id)
  { balance = initial_amount;
    key = id;
  }

  /** deposit adds money to the account.
    * @param amount - the amount of money to be added, a nonnegative int */
  public void deposit(int amount)
  { balance = balance + amount; }

  /** getBalance reports the current account balance
    * @return the balance */
  public int getBalance() { return balance; }

  /** getKey returns the account's key
    * @return the key */
  public int getKey() { return key; }
}

