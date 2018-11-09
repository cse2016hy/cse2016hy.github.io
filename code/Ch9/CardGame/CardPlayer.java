/** CardPlayer models an abstract form of card player */
public abstract class CardPlayer implements CardPlayerBehavior
{ Card[] my_hand;  // the player's cards
  int card_count;  // how many cards are held in the hand

  /** CardPlayer builds the player
    * @param max_cards - the maximum cards the player can hold.  */
  public CardPlayer(int max_cards)
  { my_hand = new Card[max_cards];
    card_count = 0;
  }

  /** wantsACard replies whether the player wants one more new card
    * @return whether a card is wanted */
  public abstract boolean wantsACard();    // method will be written later

  public void receiveCard(Card c)
  { my_hand[card_count] = c;
    card_count = card_count + 1;
  }

  /** showCards displays the player's hand
    * @return an array holding the cards in the hand  */
  public Card[] showCards()
  { Card[] answer = new Card[card_count];
    for ( int i = 0;  i!= card_count;  i = i+1 )
        { answer[i] = my_hand[i]; }
    return answer;
  }
}
