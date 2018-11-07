import java.awt.*;
import javax.swing.*;
import java.text.*;
/** BankWriter writes bank transactions */
public class BankWriter extends JPanel
{ private int WIDTH = 300;  // width and depth of displayed window
  private int DEPTH = 200;
  private BankAccount bank;  // the address of the bank account displayed
  private String last_transaction = ""; // the transaction that is displayed

  /** Constructor BankAccount initializes the writer
    * @param title - the title bar's text
    * @param b - the (address of) the bank account displayed by the Writer */
  public BankWriter(String title, BankAccount b)
  { bank = b;
    JFrame my_frame = new JFrame();
	my_frame.getContentPane().add(this);
    my_frame.setTitle(title);
    my_frame.setSize(WIDTH, DEPTH);
    my_frame.setBackground(Color.white);
    my_frame.setVisible(true);
  }

  public void paintComponent(Graphics g)
  { g.setColor(Color.white);
    g.fillRect(0, 0, WIDTH, DEPTH);  // "erase" the window
    g.setColor(Color.black);
    int text_margin = 50;
    int text_baseline = 50;
    g.drawString(last_transaction, text_margin, text_baseline);
    g.drawString("Current balance = $" + unconvert(bank.getBalance()),
                 text_margin, text_baseline + 20);
  }

  /** unconvert reformats a cents amount into a dollars,cents string */
  private String unconvert(int i)
  { double dollars_cents = i / 100.00;
    return new DecimalFormat("0.00").format(dollars_cents); 
  }

  /** showTransaction displays the result of a monetary bank transation
    * @param message - the transaction
    * @param amount - the amount of the transaction */
  public void showTransaction(String message, int amount)
  { last_transaction = message + " " + unconvert(amount);
    this.repaint();
  }

  /** showTransaction displays the result of a bank transation
    * @param message - the transaction */
  public void showTransaction(String message)
  { last_transaction = message;
    this.repaint();
  }
}