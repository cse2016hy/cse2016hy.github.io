import java.text.*;
import javax.swing.*;
/**  CelsiusToFahrenheit2 converts an input Celsius value to Fahrenheit.
  *    input: the degrees Celsius, an integer received from a dialog.
  *    output: the degrees Fahrenheit, a double. */
public class CelsiusToFahrenheit2
{ public static void main(String[] args)
  { String input =
      JOptionPane.showInputDialog("Type an integer Celsius temperature");
    int c = new Integer(input).intValue(); // convert input into an int
    double f = ((9.0 / 5.0) * c) + 32;
    DecimalFormat formatter = new DecimalFormat("0.0");
    System.out.println("For Celsius degrees " + c + ",");
    System.out.println("Degrees Fahrenheit = " + formatter.format(f));
  }
} 

