/** CardPlayerBehavior defines expected behaviors of card players */
public interface CardPlayerBehavior
{ 
  /** wantsACard replies whether the player wants one more new card
    * @return whether a card is wanted */
  public boolean wantsACard();

  /** receiveCard accepts a card and adds it to the player's hand 
    * @param c - the card  */
  public void receiveCard(Card c);
}
