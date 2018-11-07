
import java.awt.event.*;
import javax.swing.*;
/** ComputeTempButton implements a button that computes */
public class ComputeTempButton extends JButton implements ActionListener
{ private TempCalculator calc = new TempCalculator();
      // the model object for calculating temperatures
  private AbsTempFrame view;  // address of view object 

  /** Constructor ComputeTempButton constructs the button
    * @param v - the address of the view object */
  public ComputeTempButton(String label, AbsTempFrame v)
  { super("Go");
    view = v;
    addActionListener(this);  
  }

  /** actionPerformed calculates a probability */
  public void actionPerformed(ActionEvent evt)
  { try { String[] s = view.getInputs();
          double start_temp = new Double(s[0].trim()).doubleValue();
          String answer = "is ";
          if ( s[1].equals("Celsius") )
               { answer = answer + calc.celsiusIntoFahrenheit(start_temp)
                                 + " Fahrenheit"; }
          else { answer = answer + calc.fahrenheitIntoCelsius(start_temp)
                                 + " Celsius"; }
          view.displayAnswer(answer);
        }
    catch(RuntimeException e)   // a bad string in s[0] throws an exception
        { view.displayError(e.getMessage()); }
  }
}


