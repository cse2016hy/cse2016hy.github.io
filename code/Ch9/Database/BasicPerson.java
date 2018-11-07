/** BasicPerson models a simple person that knows only its name and key  */
public class BasicPerson implements Record
{ private Key k;
  private String who;

  /** BasicPerson constructs the person's record
    * @param name - the person's name
	* @param j - the person's key */
  public BasicPerson(String name, Key j)
  { who = name;
    k = j; 
  }

  /** nameOf returns the person's name */
  public String nameOf()
  { return who; }

  public Key keyOf()
  { return k; }
}
