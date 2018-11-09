/** ComputerPlayer  models a computerized card player  */
public class ComputerPlayer extends CardPlayer
{ /** ComputerPlayer builds the player
    * @param max_cards - the maximum cards the player can hold.  */
  public ComputerPlayer(int max_cards)
  { super(max_cards); }  // invoke constructor in superclass

  public boolean wantsACard()
  { int sum = 0;
	for(int i=0; i<card_count; i++) 
		sum += my_hand[i].countOf();
	return sum < 15;
  }
}
