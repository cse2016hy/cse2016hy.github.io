
public class CardGame {

	public static void main(String[] args) {
		CardPlayer p1 = new HumanPlayer(20);
		CardPlayer p2 = new ComputerPlayer(20);
		CardDeck cd = new CardDeck(); 
		while (p1.wantsACard() && p2.wantsACard()) {
			Card c; 
			c = cd.newCard(); 
			p1.receiveCard(c);
			System.out.println("Player 1 gets " + c.suitOf() + ":" + c.countOf());
			c = cd.newCard();
			p2.receiveCard(c);
			System.out.println("Player 2 gets " + c.suitOf() +  ":" + c.countOf());
		}
		Card[] p1_cards = p1.showCards();
		Card[] p2_cards = p2.showCards();
		int sum1 = 0;
		int sum2 = 0; 
		for (int i = 0; i < p1_cards.length; i++) {
			sum1 += p1_cards[i].countOf();
		}
		for (int i = 0; i < p2_cards.length; i++) {
			sum2 += p2_cards[i].countOf();
		}
		if (sum1 <= 21 && (Math.abs(sum1 - 21) < Math.abs(sum2 - 21) || sum2 > 21))
			System.out.println("Player 1 Wins!");
		else if (sum2 <= 21 && (Math.abs(sum2 - 21) < Math.abs(sum1 - 21) || sum1 > 21))
			System.out.println("Player 1 Wins!");
		else 
			System.out.println("No one wins!");

	}

}
