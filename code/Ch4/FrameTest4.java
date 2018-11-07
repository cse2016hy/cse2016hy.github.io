import javax.swing.*; 
import java.awt.*;
/** FrameTest4 displays a colorful graphics window */ 
public class FrameTest4 
{ public static void main(String[] args) 
  { JFrame my_frame = new JFrame();
    // insert a new panel into the frame
    my_frame.getContentPane().add(new MyPanel());
	// set the title bar at the top of the frame:
	my_frame.setTitle("My Frame Writer");
	// an easy way to color the background of the entire window:
	my_frame.setBackground(Color.white);
	int frame_width = 300;
	int frame_height = 200;
    my_frame.setSize(frame_width, frame_height);  
    my_frame.setVisible(true); 
    System.out.println("Frame has appeared!"); 
  } 
} 