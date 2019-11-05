import static org.junit.Assert.*;

import org.junit.Test;

class Q3Answer {
	public static int getCRT(int p1, int p2, int r1, int r2) {
		int result = -1;
		for (int i = 0; i < p1 * p2; i++) {
			// fill here!
			if (i % p1 == r1 && i % p2 == r2) result = i; 
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(getCRT(5, 7, 3, 4)); // 18
	}

}

public class Q3test {

	@Test(timeout=5000)
	public void test1() {
		int p1 = 3; 
		int p2 = 7;
		int r1 = 2;
		int r2 = 1;
		assertTrue(Q3.getCRT(p1, p2, r1, r2) == Q3Answer.getCRT(p1, p2, r1, r2));
	}
	
	@Test(timeout=5000)
	public void test2() {
		int p1 = 7; 
		int p2 = 11;
		int r1 = 5;
		int r2 = 9;
		assertTrue(Q3.getCRT(p1, p2, r1, r2) == Q3Answer.getCRT(p1, p2, r1, r2));
	}
	
	@Test(timeout=5000)
	public void test3() {
		int p1 = 5; 
		int p2 = 7;
		int r1 = 0;
		int r2 = 0;
		assertTrue(Q3.getCRT(p1, p2, r1, r2) == Q3Answer.getCRT(p1, p2, r1, r2));
	}
	
	@Test(timeout=5000)
	public void test4() {
		int p1 = 5; 
		int p2 = 11;
		int r1 = 4;
		int r2 = 10;
		assertTrue(Q3.getCRT(p1, p2, r1, r2) == Q3Answer.getCRT(p1, p2, r1, r2));
	}
	
	@Test(timeout=5000)
	public void test5() {
		int p1 = 3; 
		int p2 = 11;
		int r1 = 2;
		int r2 = 10;
		assertTrue(Q3.getCRT(p1, p2, r1, r2) == Q3Answer.getCRT(p1, p2, r1, r2));
	}

}
