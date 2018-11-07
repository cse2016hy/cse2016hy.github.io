import java.awt.*;
import javax.swing.*;
/** EggFieldWriter displays a binary tree depicted as a "field of eggs" */
public class EggFieldWriter extends JPanel
{ private int SIZE = 20;  // size for eggs
  private int TOTAL_LAYERS_OF_EGGS = 7; // how many layers to paint
  private int FRAME_WIDTH = 600;
  private int FRAME_HEIGHT = 200;

  /** Constructor EggFieldWriter creates the window and makes it visible */
  public EggFieldWriter()
  { JFrame my_frame = new JFrame();
    my_frame.getContentPane().add(this);
	my_frame.setTitle("EggFieldWriter");
    my_frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
    my_frame.setBackground(Color.white);
    my_frame.setVisible(true);
  }

  /** paintComponent fills the window with the field of eggs
    * @param g - the "graphics pen" */
  public void paintCopmonent(Graphics g)
  { paintEggField(220, 200, TOTAL_LAYERS_OF_EGGS, g); }

  /** paintEggField paints two fields of eggs behind a lead egg
    * @param left_border - the left edge of the lead egg in the field
    * @param baseline - the bottom of the lead egg
    * @param layer - how many layers of eggs to draw 
	* @param g - the graphics pen */
  private void paintEggField(int left_border, int baseline, int layer, Graphics g)
  { if ( layer > 0 )
      { int egg_size = SIZE * layer; // invent a size for the lead egg
        // paint right sub-egg field:
        paintEggField(left_border+(2*egg_size/3), baseline-(egg_size/3), layer-1, g);
		// paint left sub-egg field
        paintEggField(left_border-(egg_size/2), baseline-(egg_size/3), layer-1, g);
		// paint leading egg
        paintAnEgg(left_border, baseline, egg_size, g);  
      }
  }

  /** paintAnEgg  paints an egg in 2-by-3 proportion
    * @param left_edge - the position of the egg's left edge
    * @param bottom - the position of the egg's bottom
    * @param width - the egg's width 
	* @param g - the graphics pen */
  private void paintAnEgg(int left_edge, int bottom, int width, Graphics g)
  { int height = (2 * width)/3;
    int top = bottom - height;
    g.setColor(Color.pink);
    g.fillOval(left_edge, bottom - height, width, height);
    g.setColor(Color.black);
    g.drawOval(left_edge, bottom - height, width, height);
  }

  public static void main(String[] args)
  { new EggFieldWriter(); }
}