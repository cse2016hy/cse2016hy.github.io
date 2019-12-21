import static org.junit.Assert.*;

import org.junit.Test;

public class Q5Test {

	@Test
	public void test1() {
		Record r1 = new Class(new StringDoubleKey("CS", 2016), "Programming"); 
		Record r2 = new Class(new StringDoubleKey("CS", 664.18), "Security");
		assertTrue(r1.keyOf() != null);
		assertTrue(r2.keyOf() != null);
	}
	
	@Test
	public void test2() {
		DataBase db = new DataBase(100) ;
		Record r1 = new Class(new StringDoubleKey("CS", 2016), "Programming"); 
		Record r2 = new Class(new StringDoubleKey("CS", 664.18), "Security");
		db.insert(r1);
		db.insert(r2);
		db.delete(r1.keyOf());
		assertTrue(db.find(r1.keyOf()) == null);
		assertTrue(db.find(r2.keyOf()) != null);
	}
	
	@Test
	public void test3() {
		DataBase db = new DataBase(100);
		Record r1 = new Class(new StringDoubleKey("CS", 2016), "Programming"); 
		Record r2 = new Class(new StringDoubleKey("CS", 664.18), "Security");
		db.insert(r1);
		db.insert(r2);
		db.delete(r1.keyOf());
		db.delete(r2.keyOf());
		assertTrue(db.find(r1.keyOf()) == null);
		assertTrue(db.find(r2.keyOf()) == null);
	}
	
	@Test
	public void test4() {
		DataBase db = new DataBase(100);
		Record r1 = new Class(new StringDoubleKey("CS", 2016), "Programming"); 
		Record r2 = new Class(new StringDoubleKey("CS", 664.18), "Security");
		Record r3 = new Class(new StringDoubleKey("CS", 2016), "Programming"); 
		Record r4 = new Class(new StringDoubleKey("CS", 664.18), "Security");
		db.insert(r1);
		db.insert(r2);
		db.insert(r3);
		db.insert(r4);
		db.delete(r4.keyOf());
		assertTrue(db.find(r1.keyOf()) != null);
		assertTrue(db.find(r2.keyOf()) == null);
		assertTrue(db.find(r3.keyOf()) != null);
		assertTrue(db.find(r4.keyOf()) == null);
	}
	
	@Test
	public void test5() {
		DataBase db = new DataBase(100);
		Record r1 = new Class(new StringDoubleKey("CS", 2016), "Programming");
		Record r2 = new Class(new StringDoubleKey("CS", 2017), "Programming");
		Record r3 = new Class(new StringDoubleKey("CS", 664.18), "Security");
		Record r4 = new Class(new StringDoubleKey("CSE", 664.18), "Security");
		db.insert(r1);
		db.insert(r2);
		db.insert(r3);
		db.insert(r4);
		db.delete(r4.keyOf());
		assertTrue(db.find(r1.keyOf()) != null);
		assertTrue(db.find(r2.keyOf()) != null);
		assertTrue(db.find(r3.keyOf()) != null);
		assertTrue(db.find(r4.keyOf()) == null);
	}

}
