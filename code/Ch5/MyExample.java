import javax.swing.*;
/** MyExample displays, in a graphics window, a sentence its user types */
public class MyExample {
  public static void main(String[] args) 
  { int width = 300;
    int height = 200;
	String s = JOptionPane.showInputDialog("Please type some text:");
  	MyWriter writer = new MyWriter(width, height);
    writer.repositionSentence(50,80); // set position to my liking
	writer.writeSentence(s); // display s
  }
}