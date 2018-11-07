import java.awt.*;
import javax.swing.*;
/** EditModel models a text area  */
public class EditModel extends JTextArea
{
 /** EditModel builds the text area
   * @param initial_text - the starting text for the text area
   * @param rows - the number of rows
   * @param cols - the number of columns  */
  public EditModel(String initial_text, int rows, int cols)
  { super(initial_text, rows, cols);   // create the underlying JTextArea
    setLineWrap(true);
    setFont(new Font("Courier", Font.PLAIN, 14));
  }

  /** clear resets the text area to be empty */
  public void clear()
  { setText(""); }

  /** find locates string  s  in the text area, starting from  position */
  private int find(String s, int position)
  { String text = getText(); 
    int index = text.indexOf(s, position);       // see Table 8, Chapter 3
    if ( index != -1 )                           // did we find string  s?
         { setCaretPosition(index + s.length()); // resets the caret
           moveCaretPosition(index);             // selects the string
         }
    return index;
  }

  /** findFromStart locates a string starting from the front of the text area
    * @param s - the string to be found
    * @return the position where s is first found; -1, if s not found  */
  public int findFromStart(String s)
  { return find(s, 0); }

 /** findFromCaret locates a string starting from the caret position
    * @param s - the string to be found
    * @return the position where s is first found; -1, if s not found  */
  public int findFromCaret(String s)
  { return find(s, getCaretPosition()); }
}