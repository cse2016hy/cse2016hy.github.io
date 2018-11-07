class Card
{ // definitions that one can use to describe the value of a card:
  public static final String SPADES = "spades";
  public static final String HEARTS = "hearts";
  public static final String DIAMONDS = "diamonds";
  public static final String CLUBS = "clubs";

  public static final int ACE = 1;
  public static final int JACK = 11;
  public static final int QUEEN = 12;
  public static final int KING = 13;

  public static final int SIZE_OF_ONE_SUIT = 13;  // how many cards in one suit

  // These are the card's attributes:
  private String suit;
  private int count;

  public Card(String s, int c)
  { suit = s;
    count = c;
  }
  public String toString() {
    return (suit + ": " + count);
  }
  public String getSuit() { return suit; }
  public int getCount() { return count; }
}

class CardDeck
{
  private int last_count = -1;   // the count of the last picked card
  private String last_suit = ""; // the suit of the last picked card
  
  private int card_count;  // how many cards remain in the deck 
  private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT];
    // invariant: elements  deck[0]..deck[card_count - 1]  hold cards

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
    int index = 0;
    if ( card_count == 0 ) { 
      System.out.println("CardDeck error: no more cards"); 
    }
    else if (last_suit.length() == 0) { 
      index = (int)(Math.random() * card_count);  // randomly choose
    }
    else {
      for ( int i = 0;  i < card_count;  i = i + 1 )
        if (deck[i].getCount() == last_count || deck[i].getSuit().equals(last_suit)) {
          index = i;
        }   
    }
    next_card = deck[index];
    last_suit = next_card.getSuit(); 
    last_count = next_card.getCount();
    // once card is extracted from deck, shift other cards to fill gap:
    for ( int i = index+1;  i != card_count;  i = i + 1 )
        // so far, cards from  index+1 to i-1  have been shifted left
        //  in the array by one position
        { deck[i - 1] = deck[i]; }
    card_count = card_count - 1;
    return next_card;
  }

  /** moreCards  states whether the deck has more cards to give.
    * @return whether the deck is nonempty  */
  public boolean moreCards()
  { return (card_count > 0); }

  /** createSuit creates a suit of cards for a new card deck. */
  private void createSuit(String which_suit)
  { for ( int i = 1;  i <= Card.SIZE_OF_ONE_SUIT;  i = i + 1 )
        { deck[card_count] = new Card(which_suit, i);
          card_count = card_count + 1;
        }
  }
}

public class CardDeckManager {
  public static void main(String args[]) {
    
    CardDeck cd = new CardDeck();
    System.out.println(cd.newCard());
    System.out.println(cd.newCard());
    System.out.println(cd.newCard());
    System.out.println(cd.newCard());
    
  }
}
