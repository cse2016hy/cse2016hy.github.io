import static org.junit.Assert.*;

import org.junit.Test;

public class Q5Test {

	@Test
	public void test1() {
		Record r1 = new Book(new StringKey("b10.782"), "Java Book"); 
		Record r2 = new Book(new StringKey("c09.078"), "C++ Book");
		assertTrue(r1.keyOf() != null);
		assertTrue(r2.keyOf() != null);
	}
	
	@Test
	public void test2() {
		DataBase db = new DataBase(100) ;
		Record r1 = new Book(new StringKey("b10.782"), "Java Book"); 
		Record r2 = new Book(new StringKey("c09.078"), "C++ Book");
		db.insert(r1);
		db.insert(r2);
		db.delete(r1.keyOf());
		assertTrue(db.find(r1.keyOf()) == null);
		assertTrue(db.find(r2.keyOf()) != null);
	}
	
	@Test
	public void test3() {
		DataBase db = new DataBase(100);
		Record r1 = new Book(new StringKey("b10.782"), "Java Book"); 
		Record r2 = new Book(new StringKey("c09.078"), "C++ Book");
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
		Record r1 = new Book(new StringKey("b10.782"), "Java Book"); 
		Record r2 = new Book(new StringKey("c09.078"), "C++ Book");
		Record r3 = new Book(new StringKey("d12.08"), "D Book");
		Record r4 = new Book(new StringKey("e12.8"), "E Book");
		db.insert(r1);
		db.insert(r2);
		db.insert(r3);
		db.delete(r4.keyOf());
		assertTrue(db.find(r1.keyOf()) != null);
		assertTrue(db.find(r2.keyOf()) != null);
		assertTrue(db.find(r3.keyOf()) != null);
	}
	
	@Test
	public void test5() {
		DataBase db = new DataBase(100);
		Record r1 = new Book(new StringKey("b10.782"), "Java Book"); 
		Record r2 = new Book(new StringKey("b10.782"), "Java Book");
		Record r3 = new Book(new StringKey("d12.08"), "D Book");
		db.insert(r1);
		db.insert(r2);
		db.insert(r3);
		db.delete(r1.keyOf());
		assertTrue(db.find(r1.keyOf()) == null);
		assertTrue(db.find(r2.keyOf()) == null);
		assertTrue(db.find(r3.keyOf()) != null);
	}

}
