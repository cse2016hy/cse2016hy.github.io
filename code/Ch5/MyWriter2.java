import java.awt.*;
import javax.swing.*;
/** MyWriter2 creates a graphics winmdow that displays a sentence */
public class MyWriter2 extends JPanel 
{ private int width; // the frame's width
  private int height; // the frame's height
  private String sentence = ""; // holds the sentence to be displayed
  private int x_position; // x-position of sentence
  private int y_position; // y-position of sentence

  /** Constructor MyWriter2 creates the window and makes it visible 
    * @param w - the window's width
	* @param h - the window's height  */
  public MyWriter2(int w, int h) 
  { width = w;
	height = h;
	x_position = width / 5; // set the sentence's position
	y_position = height / 2;
	JFrame my_frame = new JFrame();
	my_frame.getContentPane().add(this);
	my_frame.setTitle("MyWriter");
    my_frame.setSize(width+5,height+25);
    my_frame.setVisible(true);
  }

  /** paintComponent paints the panel
    * @param g - the "graphics pen" that draws the items */
  public void paintComponent(Graphics g) 
  { makeBorder(g); // invoke private method to paint the border
    g.setColor(Color.red);
    g.drawString(sentence, x_position, y_position);
  }

  /** makeBorder paints the frame's border.
    * @param pen = the graphics pen used to paint the border */
  private void makeBorder(Graphics pen)
  { pen.setColor(Color.blue);
    pen.fillRect(0, 0, width, height); // paint entire window blue
	int border_size = 20;
	int center_rectangle_width = width - (2 * border_size);
	int center_rectangle_height = height - (2 * border_size);
	pen.setColor(Color.white);
	pen.fillRect(border_size, border_size, // paint center rectangle white
	             center_rectangle_width, center_rectangle_height);
  }

  /** writeSentence displays a new string in the window 
    * @param s - the sentence to be displayed */
  public void writeSentence(String s) 
  { sentence = s;
    this.repaint();  // indirectly forces paintComponent to execute
  }

  /** repositionSentence redisplays the existing sentence in a new position
    * @param new_x - the new horizontal starting position
	* @param new_y - the new vertical starting position */
  public void repositionSentence(int new_x, int new_y)
  { x_position = new_x;
    y_position = new_y;
	this.writeSentence(sentence); // force a rewrite of the existing sentence
  }
}