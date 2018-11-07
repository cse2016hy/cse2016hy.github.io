/** Card  models a playing card */
public class Card
{ // definitions that one can use to describe the value of a card:
  public static final String SPADES = "spades";
  public static final String HEARTS = "hearts";
  public static final String DIAMONDS = "diamonds";
  public static final String CLUBS = "clubs";

  public static final int SIZE_OF_ONE_SUIT = 13; 

  public static final int ACE = 1;
  public static final int JACK = 11;
  public static final int QUEEN = 12;
  public static final int KING = 13;

  // These are the card's attributes:
  private String suit;
  private int count;

  /** Constructor  Card  sets the suit and count.
    * @param s - the suit
    * @param c - the count */
  public Card(String s, int c)
  { suit = s;
    count = c;
  }

  /** suitOf returns the card's suit. */
  public String suitOf()
  { return suit; }

  /** countOf returns the card's count. */
  public int countOf()
  { return count; }
}

