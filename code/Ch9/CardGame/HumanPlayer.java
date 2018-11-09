import javax.swing.JOptionPane;

/** HumanPlayer models a human who plays cards */
public class HumanPlayer extends CardPlayer
{ /** HumanPlayer builds the player
    * @param max_cards - the maximum cards the player can hold  */
  public HumanPlayer(int max_cards)
  { super(max_cards); }   // invoke constructor in superclass

  public boolean wantsACard()
  { String response = JOptionPane.showInputDialog
	                  ("Do you want another card (Y or N)?");
    return  response.equals("Y");
  }
}
