import java.awt.event.*;
import javax.swing.*;
/** ListButton implements a button that alters a scrolling list */
public class ListButton extends JButton implements ActionListener
{ private Counter2[] counters; // address of model object
  private ListFrame view;      // address of view object

  /** Constructor ListButton constructs the controller */
  public ListButton(String label, Counter2[] c, ListFrame v)
  { super(label); 
    counters = c; 
    view = v;
    addActionListener(this); 
  }

  /** actionPerformed  handles a button-push event */
  public void actionPerformed(ActionEvent evt)
  { int choice = view.getSelection();  // get selected index number
    if ( choice != -1 )  //  Note: -1 means no item was selected.
       { counters[choice].increment();
         view.update();
       }
  }
}