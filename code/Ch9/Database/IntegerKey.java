/** IntegerKey models an integer key  */
public class IntegerKey implements Key
{ private int id; // the key number

  /** IntegerKey constructs the key object
    * @param j - the integer held as the key */
  public IntegerKey(int j)
  { id = j; }

  public boolean equals(Key another_key)
  { // since another_key is also meant to be an IntegerKey,
    // cast it to type IntegerKey and use its valOf method
	// to get an integer:
	int m = ((IntegerKey)another_key).valOf(); 
	return (id == m); 
  }

  public boolean lessthan(Key another_key)
  { int m = ((IntegerKey)another_key).valOf();
    return (id < m); 
  }

  /** valOf returns the integer value of the key */
  public int valOf()
  { return id; }
}
