
import java.awt.*;
import java.applet.*;
/** LotteryFrame implements the lottery odds calculator with a GUI. */
public class LotteryApplet1 extends Applet
{ private static final String
    BLANKS = "                                                ";
  private TextField possibles = new TextField("00", 2);
  private TextField picks = new TextField("00", 2);
  private Label answer = new Label(BLANKS);

  private ComputeButtonApplet go = new ComputeButtonApplet(this);
  private ResetButtonApplet reset = new ResetButtonApplet(this);
  private ExitButton quit = new ExitButton();

  /** Init builds the interface */
  public void init()
  { //setTitle("Probability Calculator");  
    setLayout(new GridLayout(4,1));
    setBackground(Color.magenta);
    Panel row1 = new Panel();  row1.setLayout(new FlowLayout(FlowLayout.LEFT));
    row1.add(new Label("Total numbers to choose from:"));  row1.add(possibles);
    Panel row2 = new Panel();  row2.setLayout(new FlowLayout(FlowLayout.LEFT));
    row2.add(new Label("How many do you pick?        "));  row2.add(picks);
    Panel row3 = new Panel();  row3.setLayout(new FlowLayout(FlowLayout.LEFT));
    row3.add(answer);
    Panel row4 = new Panel();
    row4.setLayout(new FlowLayout(FlowLayout.CENTER));
    row4.add(go);  row4.add(reset);  row4.add(quit);
    add(row1); add(row2); add(row3); add(row4);  
    resize(300, 200); }

  /** getInputs returns the two integers the user typed into the text fields
    * @return a two-element array holding the two integers */
  public int[] getInputs()
  { int[] nums = new int[2];
    nums[0] = new Integer( possibles.getText() ).intValue();
    nums[1] = new Integer( picks.getText() ).intValue();
    return nums; }

  /** setAnswer resets the label 
    * @param s - the string used to reset the label */
  public void setAnswer(String s) { answer.setText(s); }

  /** displayResult displays a percentage number in the table
    * @param f - the number */
  public void displayResult(float f)
  { setAnswer("Probability is " + (f*100) + "%"); }

  /** displayError displays an error message
    * @param s - the message */
  public void displayError(String s){};
    // this method will be coded later

  /** resetFields resets the interface's text fields and label */
  public void resetFields()
  { possibles.setText("00");  picks.setText("00");  answer.setText(BLANKS); }
}

