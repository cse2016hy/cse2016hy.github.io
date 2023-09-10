
public class CardDeckManager {
	public static void main(String args[]) {
		CardDeck cd = new CardDeck();
		for (int i = 0; i < 53; i++)
			System.out.println(cd.newCard());
		
	}
}
