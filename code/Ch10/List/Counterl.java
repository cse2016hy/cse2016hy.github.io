/** Counter  holds a counter */
class Counterl
{ private int count;   // the count

  /** Constructor  Counter  initializes the counter
    * @param start - the starting value for the count  */
  public Counterl(int start)
  { count = start; }

  /** increment  updates  count. */
  public void increment() { count = count +1; }

  /** countOf accesses count.
    * @return the value of  count */
  public int countOf() { return count; }
}