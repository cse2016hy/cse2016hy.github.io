import java.awt.*;
import javax.swing.*;
import java.text.*;
/** CelsiusToFahrenheitWriter creates a panel that displays a
  *  Celsius temperature and its Fahrenheit equivalent.  */
public class CelsiusToFahrenheitWriter extends JPanel
{ int frame_height = 200;  
  private int celsius;        // the input Celsius temperature
  private double fahrenheit;  // a Fahrenheit temperature: its value must
                     //   be the translation of  celsius  into Fahrenheit
  private int LEFT_MARGIN = 20;  // left margin for printing text
  private int LINE_HEIGHT = 20;  // the height of one line of text

 /** Constructor CelsiusToFahrenheitWriter receives the user's input
    *  Celsius temperature, translates it, and displays the output. */
  public CelsiusToFahrenheitWriter()
  { // read the input temperature and compute its translation:
    String input =
      JOptionPane.showInputDialog("Type an integer Celsius temperature:");
    celsius = new Integer(input).intValue();
    fahrenheit = ((9.0 / 5.0) * celsius) + 32;
    // construct the frame and show the answer:
    JFrame f = new JFrame();
    f.getContentPane().add(this);
    f.setTitle("Celsius to Fahrenheit");
    f.setSize((3 * frame_height) / 2, frame_height);
    f.setVisible(true);
  }

  /** paintComponent paints the panel with the two temperatures
    * @param g - the panel's graphics pen */
  public void paintComponent(Graphics g)
  { g.setColor(Color.white);  // paint the background:
    g.fillRect(0, 0, (3 * frame_height) / 2, frame_height);
    g.setColor(Color.red);
    int first_line = LINE_HEIGHT * 4;  // where to print the first line
    g.drawString("For Celsius degrees " + celsius + ",", LEFT_MARGIN,
                 first_line);
    DecimalFormat formatter = new DecimalFormat("0.0");
    g.drawString("Degrees Fahrenheit = " + formatter.format(fahrenheit),
                   LEFT_MARGIN, first_line + LINE_HEIGHT);
  }

  public static void main(String[] args)
  { new CelsiusToFahrenheitWriter(); }
}
 