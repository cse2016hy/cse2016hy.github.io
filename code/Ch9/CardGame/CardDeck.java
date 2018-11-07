/** CardDeck models a deck of cards. */
public class CardDeck
{
  private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT];
  private int card_count;  // how many cards remain in the deck

  /** Constructor  CardDeck  creates a new card deck with all its cards */
  public CardDeck()
  { createSuit(Card.SPADES);
    createSuit(Card.HEARTS);
    createSuit(Card.CLUBS);
    createSuit(Card.DIAMONDS);
  }

  /** newCard  gets a new card from the deck.
    * @return a card not used before, or return null, if no cards are left */
  public Card newCard()
  { Card next_card = null;
    if ( card_count == 0 )
         { System.out.println("CardDeck error: no more cards"); }
    else { int index = (int)(Math.random() * card_count);  // randomly choose
           next_card = deck[index];
           // once card is extracted from deck, fill the gap:
           deck[index] = deck[card_count - 1];
           card_count = card_count - 1;
         }
    return next_card;
  }

  /** moreCards  states whether the deck has more cards to give.
    * @return whether the deck is nonempty  */
  public boolean moreCards()
  { return (card_count > 0); }

  /** createSuit creates a suit of cards for a new card deck. */
  private void createSuit(String which_suit)
  { for ( int i = 1;  i <= Card.SIZE_OF_ONE_SUIT;  i = i+1 )
        { deck[card_count] = new Card(which_suit, i);
          card_count = card_count + 1;
        }
  }
}
