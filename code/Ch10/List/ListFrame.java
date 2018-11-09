import java.awt.*;
import javax.swing.*;
/** ListFrame shows a scrolling list */
public class ListFrame extends JFrame 
{ private Counter2[] counters; // the address of the model object
  private JList items;         // the list that displays the model's elements

  /** Constructor  ListFrame generates the frame with the list 
    * @param model - the model object that will be displayed as a list */
  public ListFrame(Counter2[] model)
  { counters = model;
    items = new JList(counters);  // embed the model into a JList
    JScrollPane sp = new JScrollPane(items);  // attach a scroll bar
    Container cp = getContentPane();
    cp.setLayout(new GridLayout(2,1));
    cp.add(sp);                   // add the scrolling list to the pane
      JPanel p = new JPanel(new GridLayout(2,1)); 
      p.add(new ListButton("Go", counters, this));  // see Figure 27
      p.add(new ExitButton4("Quit"));                // see Figure 16
    cp.add(p);
    update();  // initialize the view of the list
    setTitle("ListExample"); 
    setSize(200,200);
    setVisible(true);
  }

  /** getSelection returns which list item is selected by the user
    * @return the element's index, or -1 is no item is selected  */
  public int getSelection()
  { return items.getSelectedIndex(); } 

  /** update refreshes the appearance of the list */
  public void update()
  { items.clearSelection(); }  // deselect the selected item in the list
}