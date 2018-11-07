
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/** CountButton defines a button-controller */
public class CountButton extends JButton implements ActionListener
{ private UpdateableView view;   // the view that holds this controller
  private Counter model;  // the model that this controller collaborates with

  /** Constructor CountButton builds the controller
    * @param my_label - the label on the button that represents the controller
    * @param my_model - the model that the controller collaborates with
    * @param my_view - the view that the controller updates  */
  public CountButton(String my_label, Counter my_model, UpdateableView my_view)
  { super(my_label);  // attach label to the button in the superclass
    view = my_view;
    model = my_model;
    addActionListener(this); // attach this very object as the ``listener''
  }

  /** actionPerformed handles a push of this button
    * @param evt - the event that occurred, namely, the button push */
  public void actionPerformed(ActionEvent evt)
  { model.increment();
    view.update();
  }
}



