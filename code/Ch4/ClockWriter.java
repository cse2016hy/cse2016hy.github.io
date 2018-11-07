import java.awt.*;
import javax.swing.*;
import java.util.*;
/** ClockWriter  draws a clock in a panel.  */
public class ClockWriter extends JPanel
{ 
	int width;
	  GregorianCalendar time = new GregorianCalendar();

	public ClockWriter()
  { width = 400;  // the width of the clock
    // construct this panel's frame:
    JFrame clocks_frame = new JFrame();
    // and insert _this_ panel into its frame:
    clocks_frame.getContentPane().add(this);
    // show the frame:
    clocks_frame.setTitle("Clock");
    clocks_frame.setSize(width, width);
    clocks_frame.setVisible(true);
  }

  /** paintComponent  draws the clock with the correct time.
    * @param g - the graphics pen that does the drawing */
  public void paintComponent(Graphics g)
  { 
    g.setColor(Color.white);
    g.fillRect(0, 0, width, width);  // paint the background
    int minutes_angle = 90 - (time.get(Calendar.MINUTE) * 6);
    int hours_angle = 90 - (time.get(Calendar.HOUR) * 30);
    int seconds_angle = 90 - (time.get(Calendar.SECOND) * 6);
    // draw the clock as a black circle:
    int left_edge = 50;
    int top = 50;
    int diameter = width - 100;
    g.setColor(Color.black);
    g.drawOval(left_edge, top, diameter, diameter);
    // draw the minutes' hand red, 15 pixels smaller, with a width of 5 degrees:
    g.setColor(Color.red);
    g.fillArc(left_edge + 15, top + 15, diameter - 30, diameter - 30,
              minutes_angle, 5);
    // draw the hours' hand blue, 25 pixels smaller, with a width of -8 degrees:
    g.setColor(Color.blue);
    g.fillArc(left_edge + 25, top + 25, diameter - 50, diameter - 50,
              hours_angle, -8);
    // draw the seconds' hand blue, 15 pixels smaller, with a width of 3 degrees:
    g.setColor(Color.black);
    g.fillArc(left_edge + 15, top + 15, diameter - 30, diameter - 30,
    		seconds_angle, 3);
//    System.out.println(hours_angle + " : " + minutes_angle + " : " + seconds_angle);
  }

  /** delay pauses execution for  how_long  milliseconds */
  private void delay(int how_long)
  { try { Thread.sleep(how_long); }
    catch (InterruptedException e) { }
  }
  
  /** The main method assembles the clock in its frame.  The method
    * is inserted here for testing purposes.  */
  public static void main(String[] args)
  { 
	  ClockWriter clock = new ClockWriter();
	  while (true) {
		  clock.delay(100);
		  clock.repaint();
	  }
  }
}




