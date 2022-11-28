


public class BookRecord implements Record {
	// the names of the fields describe their contents:
	  private Key catalog_number;
	  private String title;
	  private String author;
	  private int publication_date;

	  public BookRecord(Key num, String a, String t, int date)
	  { catalog_number = num;
	    title = t;
	    author = a;
	    publication_date = date;
	  }

	  public Key getKey() { return catalog_number; }
	  
	  public String getTitle() { return title; }

	  public String getAuthor() { return author; }

	  public int getDate() { return publication_date; }
	  
	  public String toString() { return catalog_number.toString() + " " + getTitle(); }
}
