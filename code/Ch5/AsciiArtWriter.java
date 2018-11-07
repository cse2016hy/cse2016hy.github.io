/** AsciiArtWriter contains methods for drawing Ascii art. */ 
public class AsciiArtWriter
{ /** Constructor AsciiArtWriter does an ¡°initialization.¡± */
  public AsciiArtWriter()
	{ System.out.println(); }
  
  /** printBee prints a bee */ 
  public void printBee() 
  { System.out.println(" ,-."); 
    System.out.println(" \\_/");   // the \ must be written as \\
    System.out.println(">{|||}-"); 
    System.out.println(" / \\"); 
    System.out.println(" `-^  hjw"); 
    System.out.println();
  }
  
  /** printButterfly prints a butterfly */
  public void printButterfly()
  { System.out.println("   _ \"");  // the " must be written as \"
    System.out.println("  (_\\|/_)");   
    System.out.println("   (/|\\)  ejm97"); 
    System.out.println();
  }
  
  /** printLadybug prints a lazybug */
  public void printLadybug()
  { System.out.println(" `m\'");  // the ' must be written as \'
    System.out.println(" (|)  sahr");   
    System.out.println(); 
  }
}