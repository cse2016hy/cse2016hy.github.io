import javax.swing.*;
/** MyExample displays, in a graphics window, a sentence its user types */
public class MyExample2 {
  public static void main(String[] args) 
  { int width = 300;
    int height = 200;
	String s = JOptionPane.showInputDialog("Please type some text:");
  	MyWriter2 writer = new MyWriter2(width, height);
    writer.repositionSentence(50,80); // set position to my liking
	writer.writeSentence(s); // display s
  }
}