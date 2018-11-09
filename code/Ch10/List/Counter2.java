/** Counter2 is a Counter that states its identity with a  toString  method */
public class Counter2 extends Counterl
{ private int my_index; 

  public Counter2(int start, int index)
  { super(start); 
    my_index = index;
  }

  public String toString()
  { return "Counter " + my_index + " has " + countOf(); }
}