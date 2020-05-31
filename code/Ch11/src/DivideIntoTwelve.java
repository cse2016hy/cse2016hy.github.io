import javax.swing.*;
/** DivideIntoTwelve  reads an int and divides it into 12  */
public class DivideIntoTwelve
{ public static void main(String[] args)
  { int i = readAnInt();
    JOptionPane.showMessageDialog(null, "Answer is " + (12 / i));
    System.out.println("Finished.");
  }

  /** readAnInt  reads an int and returns it */
  private static int readAnInt()
  { String s = JOptionPane.showInputDialog("Please type an int:");
    int num = new Integer(s).intValue();
    return num;
  }
}