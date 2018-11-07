import javax.swing.*;
/** FrameTest2  creates and displays an empty frame */
public class FrameTest2
{ public static void main(String[] args)
  { JFrame sample_frame = new JFrame();
    sample_frame.setSize(300, 200);  // tell frame  to size itself
    sample_frame.setVisible(true);   // tell frame to make itself visible
    System.out.println("Frame has appeared!");
  }
}