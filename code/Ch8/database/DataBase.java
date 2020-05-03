package database;

public class DataBase {
	private Record[] base;
	
	public DataBase(int initial_size) {
		if (initial_size < 0) initial_size = 1;
		base = new Record[initial_size];
	}

	public Record find(Key k) {
		for (int i = 0; i < base.length; i++) {
			if (base[i] != null && base[i].keyOf().equals(k)) {
				return base[i];
			}
		}
		return null;
	}
	
	public boolean insert(Record r) {
		int i; 
		if (find(r.keyOf()) != null) {
			return false; 
		}
		for (i = 0; i < base.length; i++) {
			if (base[i] == null) {
				base[i] = r; 
				return true; 
			}
		}
		// base 크기증가
		Record[] base_new = new Record[base.length * 2];
		// 기존 원소 복사 
		for (i = 0; i < base.length; i++) { 
			base_new[i] = base[i];
		}
		base = base_new; 
		// r 추가 
		base[i] = r;
		return true; 
	}

	public boolean delete(Key k) {
		for (int i = 0; i < base.length; i++) {
			if (base[i] != null && base[i].keyOf().equals(k)) {
				base[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase db = new DataBase(100) ;
		Record r1 = new Record(new Key("a", 0.82), "lee", "a", 1987); 
		Record r2 = new Record(new Key("b", 0.82), "kim", "b", 1988); 
		db.insert(r1);
		db.insert(r2);
		db.delete(r1.keyOf());
		System.out.println(db.find(r1.keyOf()));
		System.out.println(db.find(r2.keyOf()));
	}
	
}
