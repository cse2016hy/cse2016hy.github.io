import javax.swing.*; 
/** FrameTest3 creates a frame and a panel with a string,
     and then inserts the panel into the frame */ 
public class FrameTest3 
{ public static void main(String[] args) 
  { // construct the panel and frame:
    TestPanel sample_panel = new TestPanel();
    JFrame sample_frame = new JFrame(); 
    // insert the panel into the frame:
    sample_frame.getContentPane().add(sample_panel);
    // finish by sizing and showing the frame with its panel:
    sample_frame.setSize(300, 200);  
    sample_frame.setVisible(true); 
    System.out.println("Frame has appeared!"); 
  } 
} 