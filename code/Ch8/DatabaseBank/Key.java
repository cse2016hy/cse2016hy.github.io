/** Key models an integer key */
public class Key
{ private int k;  // the integer key

  /** Constructor  Key  constructs the Key 
    * @param i - the integer that uniquely defines the key */
  public Key(int i) {  k = i; }

  /** equals  compares this Key to another for equality
    * @param c - the other key
    * @return true, if this key equals k's; return false, otherwise */
  public boolean equals(Key c)
  { return  ( k == c.getInt() ); }

  /** getInt returns the integer value held within this key */
  public int getInt() { return k; }
}

