public class TestLineReaderAgain
{ public static void main(String[] args)
  { LineReaderImproved r = new LineReaderImproved(System.in);
    int i = r.readInt("Please type an integer: ");
    System.out.println("The int is " + i);
  }
}
