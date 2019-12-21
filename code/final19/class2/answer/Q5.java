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

class StringDoubleKey implements Key { 
	private String id_str; 
	private double id_double; 
	public StringDoubleKey(String s, double j) { 
		id_str = s;
		id_double = j;
	}
	public boolean equals(Key another_key) { 
		// fill here!
		String s = ((StringDoubleKey)another_key).strOf();
		double j = ((StringDoubleKey)another_key).doubleOf();
		return s.equals(id_str) && (id_double == j); 
	} 
	public String strOf() { return id_str; }
	public double doubleOf() { return id_double; }
	public String toString() { return id_str + id_double; }
}

class Class implements Record {
	 private StringDoubleKey class_id;
	 private String name; 
	 public Class(StringDoubleKey cid, String n) {
		 // fill here!
		 class_id = cid;
		 name = n; 
	 }
	 public Key keyOf() { 
		 // fill here! 
		 return (Key) class_id; 
	 }
	 public String toString() {
		 return class_id.toString() + " " + name;
	 }
} 

public class Q5 {

	public static void main(String[] args) {
		DataBase db = new DataBase(100) ;
		Record r1 = new Class(new StringDoubleKey("CS", 2016), "Programming"); 
		Record r2 = new Class(new StringDoubleKey("CS", 664.18), "Security"); 
		db.insert(r1);
		db.insert(r2);
		db.delete(r1.keyOf());
		System.out.println(db.find(r1.keyOf())); // null
		System.out.println(db.find(r2.keyOf())); // CS664.18 Security
	}
}
