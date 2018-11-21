import javax.swing.*;
/** DivideIntoTwelve  reads an int and divides it into 12  */
public class DivideIntoTwelve3
{ public static void main(String[] args)
  { int i = readAnInt();
    try { JOptionPane.showMessageDialog(null, "Answer is " + (12 / i)); }
    catch(ArithmeticException e)
      { JOptionPane.showMessageDialog(null,
                 "Error in input: " + i + ". Restart program.");
      }
    System.out.println("Finished.");
  }

  /** readAnInt  reads an int and returns it */
  private static int readAnInt()
  { int num;
    String s = JOptionPane.showInputDialog("Please type an int:");
    try { num = new Integer(s).intValue(); }
    catch(NumberFormatException e)
        { JOptionPane.showMessageDialog(null,
                         "Input " + s + " not an int. Try again!");
          num = readAnInt();  // restart with a recursive invocation!
        }
    return num;
  }
}