

public class Database {
	private Record[] base;
	
	public Database(int initial_size) {
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
		Database db = new Database(100) ;
		Record r1 = new BookRecord(new CodeKey("a", 82), "lee", "intro to java", 1987); 
		Record r2 = new BookRecord(new CodeKey("b", 83), "kim", "intro to python", 1988); 
//		Record r1 = new StudentRecord(new IntegerKey(20220000), "chulsu lee"); 
//		Record r2 = new StudentRecord(new IntegerKey(20221111), "jieun kim");
		db.insert(r1);
		db.insert(r2);
		System.out.println(db.find(r1.getKey()));  
		System.out.println(db.find(r2.getKey()));  
	}
	
}
