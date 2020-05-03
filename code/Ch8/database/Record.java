package database;


public class Record {
	// the names of the fields describe their contents:
	  private Key catalog_number;
	  private String title;
	  private String author;
	  private int publication_date;
	  private boolean is_borrowed_by_someone;

	  /** Constructor Record constructs the book.
	    * @param num - the book's catalog number
	    * @param a - the book's author
	    * @param t - the book's title   */
	  public Record(Key num, String a, String t, int date)
	  { catalog_number = num;
	    title = t;
	    author = a;
	    publication_date = date;
	    is_borrowed_by_someone = false;
	  }

	  /** getkey  returns the key that identifies the record
	    * @return the key  */
	  public Key getKey() { return catalog_number; }
	  public Key keyOf() { return catalog_number; }
	  

	  /** getTitle returns the book's title 
	    * @return the title */
	  public String getTitle() { return title; }

	  /** getAuthor returns the book's author 
	    * @return the author */
	  public String getAuthor() { return author; }

	  /** getDate returns the book's publication date
	    * @return the date */
	  public int getDate() { return publication_date; }
	  
	  public String toString() { return catalog_number.toString() + " " + getTitle(); }
}
