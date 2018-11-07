/** Database  implements a database of records */
public class Database
{ private Record[] base;   // the collection of records
  private int count;       // how many records are stored in the database
                           // invariant:  0 <= item_count <= base.length
  private int NOT_FOUND = -1; // code used to denote when a record not found

  /** Constructor  Database  initializes the database
    * @param initial_size - the size of the database */
  public Database(int initial_size)
  { if ( initial_size > 0 )
         { base = new Record[initial_size]; }
    else { base = new Record[1]; }
    count = 0;
  }

  /** locationOf is a helper method that searches base for a record
    * whose key is k.
	* If found, the index of the record is returned,
	* else NOT_FOUND is returned. */
  private int locationOf(Key k)
  { int result = NOT_FOUND;
    boolean found = false;
    int i = 0;
    while ( !found  &&  i != base.length )
          { if ( base[i] != null  &&  base[i].keyOf().equals(k) )
                 { found = true;
                   result = i;
                 }
            else { i = i+1; }
          }
    return result;
  }

  /** find  locates a record in the database based on a key
    * @param key - the key of the desired record
    * @return (the address of) the desired record;
    *  return  null if record not found.  */
  public Record find(Key k)
  { Record answer = null;
    int index = locationOf(k);
    if ( index != NOT_FOUND )
       { answer = base[index]; }
    return answer;
  }

  /** insert inserts a new record into the database.
    * @param r - the record
    * @return true, if record added; return false if record not added because
    *   another record with the same key already exists in the database */
  public boolean insert(Record r)
  { boolean success = false;
    if ( locationOf(r.keyOf()) == NOT_FOUND )  // r not already in base?
       { // find an empty element in base for insertion of r:
	     boolean found_empty_place = false;
         int i = 0;
         while ( !found_empty_place  &&  i != base.length )
               // so far, all of  base[0]..base[i-1]  are occupied
               { if ( base[i] == null )   // is this element empty?
                      { found_empty_place = true; }
                 else { i = i+1; }
               }
         if ( found_empty_place )
              { base[i] = r; }
         else { // array is full!  So, create a new one to hold more records:
                Record[] temp = new Record[base.length * 2];
                for ( int j = 0;  j != count;  j = j+1 )
                    // copying contents of  base  into  temp
                    { temp[j] = base[j]; }
                base = temp;   // change  base  to hold address of  temp
                base[count] = r;   // insert  r  in first free element
              }
         count = count + 1;    // remember that we added a record
         success = true;
       }
    return success;
  }

  /** delete removes a record in the database based on a key
    * @param key - the record's key (identification)
    * @return true, if record is found and deleted; return false otherwise  */
  public boolean delete(Key k)
  { boolean result = false;
    int index = locationOf(k);
    if ( index != NOT_FOUND )
       { base[index] = null;
         count = count - 1;  // remember that we deleted a record
         result = true;
       }
    return result;
  }
}
