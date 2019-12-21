interface Key { public boolean equals(Key m); }
interface Record { public Key keyOf(); }
class DataBase {
	private Record[] base;
	public DataBase(int initial_size) {
		if (initial_size < 0) initial_size = 1;
		base = new Record[initial_size];
	}
	public Record find(Key k) {
		for (int i = 0; i < base.length; i++) {
			if (base[i] != null && base[i].keyOf().equals(k)) 
				return base[i];
		}
		return null;
	}
	public boolean insert(Record r) {
		int i; 
		if (find(r.keyOf()) != null) return false;
		for (i = 0; i < base.length; i++) {
			if (base[i] == null) {
				base[i] = r; return true; 
			}
		}
		Record[] base_new = new Record[base.length * 2];
		for (i = 0; i < base.length; i++)  
			base_new[i] = base[i];
		base = base_new; 
		base[i] = r;
		return true; 
	}
	public boolean delete(Key k) {
		for (int i = 0; i < base.length; i++) {
			if (base[i] != null && base[i].keyOf().equals(k)) {
				base[i] = null; return true;
			}
		}
		return false;
	}	
}

class StringKey implements Key { 
	private String id; 
	public StringKey(String j) { id = j; }
	public boolean equals(Key another_key) {
		// fill here!
		String m = ((StringKey)another_key).valOf(); 
		return (m.equals(id)); 
	} 
	public String valOf() { return id; }
	public String toString() { return id; }
}

class Book implements Record {
	 private StringKey book_id;
	 private String title; 
	 public Book(StringKey id, String n) {
		 // fill here!
		 book_id = id;
		 title = n; 
	 }
	 public Key keyOf() {
		// fill here!
		 return (Key) book_id; 
	 }
	 public String toString() {
		 return book_id.toString() + ": " + title;
	 }
} 

public class Q5 {

	public static void main(String[] args) {
		DataBase db = new DataBase(100) ;
		Record r1 = new Book(new StringKey("b10.782"), "Java Book"); 
		Record r2 = new Book(new StringKey("c09.078"), "C++ Book"); 
		db.insert(r1);
		db.insert(r2);
		db.delete(r1.keyOf());
		System.out.println(db.find(r1.keyOf())); // null
		System.out.println(db.find(r2.keyOf())); // c09.078: C++ Book
	}
}
