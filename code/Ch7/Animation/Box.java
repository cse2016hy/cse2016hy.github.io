/** Box models a box in which moving objects live */
public class Box
{ private int box_size;  // the size of the box

  /** Constructor Box builds the box
    * @param size - the size of the box */
  public Box(int size)
  { box_size = size; }

  /** inHorizontalContact replies whether a position has contacted a
    *  horizontal wall.
    * @param x_position - the position examined
    * @return true, if  x_position  equals or exceeds the positions of the
    *   horizontal walls; return false, otherwise  */
  public boolean inHorizontalContact(int x_position)
  { return (x_position <= 0 ) || (x_position >= box_size); }

  /** inVerticalContact replies whether a position has contacted a
    *  vertical wall.
    * @param y_position - the position examined
    * @return true, if  y_position  equals or exceeds the positions of the
    *   vertical walls; return false, otherwise  */
  public boolean inVerticalContact(int y_position)
  { return (y_position <= 0 ) || (y_position >= box_size); }

  /** sizeOf returns the size of the box */
  public int sizeOf()
  { return box_size; }
}
