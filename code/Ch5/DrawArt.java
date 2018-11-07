/** DrawArt prints some Ascii art and a message */
public class DrawArt
{ public static void main(String[] args) 
  { AsciiArtWriter writer = new AsciiArtWriter();
    writer.printBee();
	System.out.println("This is a test.");
	writer.printButterfly();
	writer.printLadybug();
	}
}
