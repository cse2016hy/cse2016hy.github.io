import java.awt.event.*;
/** CountController handles button push events that increment a counter */
public class CountController implements ActionListener
{ private Frame2b view;  // the view that must be refreshed
  private Counterl model;  // the counter model

  /** CountController constructs the controller
    * @param my_model - the model object
    * @param my_view - the view object  */
  public CountController(Counterl my_model, Frame2b my_view)
  { view = my_view;
    model = my_model;
  }

  /** actionPerformed handles a button-push event */
  public void actionPerformed(ActionEvent evt)
  { model.increment();
    view.update();
  }
}