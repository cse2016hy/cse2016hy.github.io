
public class Q1test {
    @Test(timeout=5000)
    public void test1() {
        CardDeck cd = new CardDeck();
        Card prev = cd.newCard(); 
        for (int i = 0; i < 5; i++) {
           Card c = cd.newCard(); 
           assertTrue((prev.getCount() == c.getCount()) || (prev.getSuit().equals(c.getSuit())));   
            prev = c; 
        }
    }
    @Test(timeout=5000)
    public void test2() {
      CardDeck cd = new CardDeck();
      Card prev = cd.newCard(); 
        for (int i = 0; i < 15; i++) {
           Card c = cd.newCard(); 
           assertTrue((prev.getCount() == c.getCount()) || (prev.getSuit().equals(c.getSuit())));   
            prev = c; 
        }
    }
    @Test(timeout=5000)
    public void test3() {
      CardDeck cd = new CardDeck();
      Card prev = cd.newCard(); 
        for (int i = 0; i < 25; i++) {
           Card c = cd.newCard(); 
           assertTrue((prev.getCount() == c.getCount()) || (prev.getSuit().equals(c.getSuit())));   
            prev = c; 
        }
    }
    @Test(timeout=5000)
    public void test4() {
      CardDeck cd = new CardDeck();
      Card prev = cd.newCard(); 
        for (int i = 0; i < 35; i++) {
           Card c = cd.newCard(); 
           assertTrue((prev.getCount() == c.getCount()) || (prev.getSuit().equals(c.getSuit())));   
            prev = c; 
        }
    }
    @Test(timeout=5000)
    public void test5() {
      CardDeck cd = new CardDeck();
      Card prev = cd.newCard(); 
        for (int i = 0; i < 45; i++) {
           Card c = cd.newCard(); 
           assertTrue((prev.getCount() == c.getCount()) || (prev.getSuit().equals(c.getSuit())));   
            prev = c; 
        }
    }
}
