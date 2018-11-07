import java.awt.*; 
import java.applet.*;
// import javax.swing.*; 
/** MyApplet displays a window with geometric figures */ 
public class MyApplet extends Applet 
{ // An applet has no constructor method---instead, it has an init method:   
  /** init constructs the applet for display */ 
  public void init() 
  { setBackground(Color.white); } 
 
  /** paintComponent is renamed paint:
    * paint fills the window with the items that must be displayed 
    * @param g - the "graphics pen" that draws the items onto the window */ 
  public void paint(Graphics g) 
  { g.setColor(Color.red); 
    int left_edge = 105; 	// the left border where the shapes appear
    int bottom = 130; 	// the top where the shapes appear
    // draw a rectangle: 
    int width = 90; 
    int height = 60; 
    g.drawRect(left_edge, bottom - height, width, height); 
    // draw a filled circle: 
    int diameter = 40; 
    g.fillOval(left_edge, bottom - diameter, diameter, diameter); 
  } 
} 
