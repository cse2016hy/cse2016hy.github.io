/** Key is an identification, or "key," value   */
public interface Key
{ /** equals  compares itself to another key, m, for equality
    * @param m - the other key
    * @return true, if this key and  m  have the same key value;
    *  return false, otherwise  */
  public boolean equals(Key m);

  /** lessthan  compares itself to another key, m, for lessthan
    * @param m - the other key
    * @return true, if this key is a lesser key value than  m;
    *  return false, otherwise  */
  public boolean lessthan(Key m);
}
