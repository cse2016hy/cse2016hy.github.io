
import java.awt.*;
import java.awt.event.*;
/** ComputeButton implements a button that computes probabilities */
public class ComputeButtonApplet extends Button implements ActionListener
{ private LotteryCalculator c = new LotteryCalculator();
      // the model object for calculating lottery odds 
  private LotteryApplet1 f; /// address of view object that receives the result
  /** Constructor ComputeButton constructs the button
    * @param ff - the address of the view object */
  public ComputeButtonApplet(LotteryApplet1 ff)
  { super("Go");  addActionListener(this);  f = ff;  }

  /** actionPerformed calculates a probability */
  public void actionPerformed(ActionEvent evt)
  { try { int[] number = f.getInputs();
          f.displayResult( c.calcProbability(number[0], number[1])); }
    catch(RuntimeException e)   // thrown exceptions, if any, are caught here
         { f.displayError(e.getMessage()); }
  }
}

