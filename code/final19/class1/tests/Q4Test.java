import static org.junit.Assert.*;

import org.junit.Test;

public class Q4Test {

	private boolean isNextCard(Card card_before, Card card) {
		  int gap = Math.abs(card.getCount() - card_before.getCount());
		  boolean same_suit = card.getSuit().equals(card_before.getSuit());
		  return (same_suit && (gap == 1)) || (!same_suit && (gap == 0));
	}
	
	@Test
	public void test1() {
		CardDeck cd = new CardDeck();
		Card c1 = cd.newCard(); 
		assertTrue(c1 != null);
	}
	
	@Test
	public void test2() {
		CardDeck cd = new CardDeck();
		Card c1 = cd.newCard();
		Card c2 = cd.newCard();
		assertTrue(isNextCard(c1, c2));
	}
	
	@Test
	public void test3() {
		CardDeck cd = new CardDeck();
		Card c1 = cd.newCard();
		Card c2 = cd.newCard();
		Card c3 = cd.newCard();
		assertTrue(isNextCard(c1, c2));
		assertTrue(isNextCard(c2, c3));
	}
	
	@Test
	public void test4() {
		CardDeck cd = new CardDeck();
		Card c1 = cd.newCard();
		Card c2 = cd.newCard();
		Card c3 = cd.newCard();
		Card c4 = cd.newCard();
		assertTrue(isNextCard(c1, c2));
		assertTrue(isNextCard(c2, c3));
		assertTrue(isNextCard(c3, c4));
	}
	
	@Test
	public void test5() {
		CardDeck cd = new CardDeck();
		Card c1 = cd.newCard();
		Card c2 = cd.newCard();
		Card c3 = cd.newCard();
		Card c4 = cd.newCard();
		Card c5 = cd.newCard();
		assertTrue(isNextCard(c1, c2));
		assertTrue(isNextCard(c2, c3));
		assertTrue(isNextCard(c3, c4));
		assertTrue(isNextCard(c4, c5));
	}

}
