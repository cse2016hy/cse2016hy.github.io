/** ComputerPlayer  models a computerized card player  */
public class ComputerPlayer extends CardPlayer
{ /** ComputerPlayer builds the player
    * @param max_cards - the maximum cards the player can hold.  */
  public ComputerPlayer(int max_cards)
  { super(max_cards); }  // invoke constructor in superclass

  public boolean wantsACard()
  { Card[] what_i_have = showCards();
    ..statements go here that examine  what_i_have  and calculate a decision..
    return decision;
  }
}
