import static org.junit.Assert.*;

import org.junit.Test;

class Q4Answer {
	public static String toKary(int n, int k) {
		if (n < k) return "" + n; 
		// fill here!
		return "" + toKary(n / k, k) + n % k; 
	}
	public static void main(String[] args) {
		System.out.println(toKary(15, 2)); // 1111
		System.out.println(toKary(15, 3)); // 120
	}
}


public class Q4test {

	@Test(timeout=5000)
	public void test1() {
		int n = 100;
		int k = 3; 
		assertTrue(Q4.toKary(n, k).equals(Q4Answer.toKary(n, k)));
	}
	
	@Test(timeout=5000)
	public void test2() {
		int n = 1637;
		int k = 2; 
		assertTrue(Q4.toKary(n, k).equals(Q4Answer.toKary(n, k)));
	}
	
	@Test(timeout=5000)
	public void test3() {
		int n = 19919;
		int k = 9; 
		assertTrue(Q4.toKary(n, k).equals(Q4Answer.toKary(n, k)));
	}
	
	@Test(timeout=5000)
	public void test4() {
		int n = 0;
		int k = 3; 
		assertTrue(Q4.toKary(n, k).equals(Q4Answer.toKary(n, k)));
	}
	
	@Test(timeout=5000)
	public void test5() {
		int n = 120;
		int k = 8; 
		assertTrue(Q4.toKary(n, k).equals(Q4Answer.toKary(n, k)));
	}
}
