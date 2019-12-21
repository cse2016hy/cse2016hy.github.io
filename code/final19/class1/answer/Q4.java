class Card { 
  public static final String SPADES = "spades";
  public static final String HEARTS = "hearts";
  public static final String DIAMONDS = "diamonds";
  public static final String CLUBS = "clubs";
  public static final int ACE = 1;
  public static final int JACK = 11;
  public static final int QUEEN = 12;
  public static final int KING = 13;
  public static final int SIZE_OF_ONE_SUIT = 13;
  private String suit;
  private int count;
  public Card(String s, int c) { suit = s; count = c; }
  public String toString() { return (suit + ": " + count); }
  public String getSuit() { return suit; }
  public int getCount() { return count; }
}

class CardDeck {
  private int card_count;  // 현재 남아있는 카드 수 
  private Card card_before = null; // 이전에 newCard()에 의해 뽑혔던 카드
  private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT];
  public CardDeck() { 
	createSuit(Card.SPADES);
    createSuit(Card.HEARTS);
    createSuit(Card.CLUBS);
    createSuit(Card.DIAMONDS);
  }
  private boolean isNextCard(Card card) {
	  int gap = Math.abs(card.getCount() - card_before.getCount());
	  boolean same_suit = card.getSuit().equals(card_before.getSuit());
	  return (same_suit && (gap == 1)) || (!same_suit && (gap == 0));
  }
  public Card newCard() { 
	Card next_card = null; // 이번에 줄 카드 
	int index = 0;   
	// fill here!
	// Math.random(): 0이상 1이하의 실수를 랜덤하게 선택하여 반환한다. 
    if ( card_count == 0 ) {
    	return null;
    }	
    else if (card_before == null) {
    	index = (int)(Math.random() * card_count);
    }	
    else { 
    	for (int i = 0;  i != card_count;  i = i + 1)
        	if (isNextCard(deck[i])) {
        		index = i; 
        		break; 
        	}
    }
    next_card = deck[index];
    card_before = next_card;
    for ( int i = index+1;  i != card_count;  i = i + 1 )
    	deck[i - 1] = deck[i]; 
    card_count = card_count - 1;
    return next_card;
  }
  public boolean moreCards() { return (card_count > 0); }
  private void createSuit(String which_suit) { 
	  for ( int i = 1;  i <= Card.SIZE_OF_ONE_SUIT;  i = i + 1 ) { 
		  deck[card_count] = new Card(which_suit, i);
          card_count = card_count + 1;
      }
  }
}

public class Q4 {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		System.out.println(cd.newCard().toString()); // hearts: 13
		System.out.println(cd.newCard().toString()); // spades: 13
		System.out.println(cd.newCard().toString()); // spades: 12
	}
}

