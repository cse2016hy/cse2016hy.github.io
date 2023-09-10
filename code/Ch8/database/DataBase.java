package database;

public class DataBase {
	private Record[] base;
	
	public DataBase(int initial_size) {
		base = new Record[initial_size]; 
	}

	public Record find(Key k) {
		for (int i = 0; i < base.length; i++) {
			if (base[i] != null && base[i].getKey().equals(k)) {
				return base[i]; 
			}
		}
		return null; 
	}
	
	public boolean insert(Record r) {
		if (find(r.getKey()) == null) {
			for (int i = 0; i < base.length; i++) {
				if (base[i] == null) {
					base[i] = r; 
					return true; 
				}
			}
			Record[] new_base = new Record[base.length * 2];
			for (int i = 0; i < base.length; i++) {
				new_base[i] = base[i]; 
			}
			new_base[base.length] = r;
			base = new_base;
			return true; 
		}
		else {
			return false; 
		}
	}

	public boolean delete(Key k) {
		for (int i = 0; i < base.length; i++) {
			if (base[i] != null && base[i].getKey().equals(k)) {
				base[i] = null;
				return true; 
			}
		}
		return false; 
	}
	
	public static void main(String[] args) {
		DataBase db = new DataBase(100) ;
		Record r1 = new Record(new Key("a", 0.82), "lee", "intro to java", 1987); 
		Record r2 = new Record(new Key("b", 0.82), "kim", "intro to python", 1988); 
		db.insert(r1);
		db.insert(r2);
		db.delete(r1.getKey());
		System.out.println(db.find(r1.getKey())); // null 
		System.out.println(db.find(r2.getKey())); // b0.82 kim intro to python ... 
	}
	
}
