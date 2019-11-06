import static org.junit.Assert.*;

import org.junit.Test;

class Q4Answer {
	public static int fibonacci(int n) {
		// fill here!
		if (n == 1 || n == 2) return 1; 
		return fibonacci(n - 2) + fibonacci(n - 1); 
	}
	
	public static int newfibonacci(int n) {
		// fill here!
		if (n == 1 || n == 2 || n == 3) return 1; 
		return newfibonacci(n - 3) + newfibonacci(n - 1); 
	}
}

public class Q4test {

	@Test(timeout=1200000)
	public void test1() {
		int n = 1; 
		assertTrue(Q4.newfibonacci(n) == Q4Answer.newfibonacci(n)); 
	}
	
	@Test(timeout=1200000)
	public void test2() {
		int n = 2; 
		assertTrue(Q4.newfibonacci(n) == Q4Answer.newfibonacci(n)); 
	}
	
	@Test(timeout=1200000)
	public void test3() {
		int n = 3; 
		assertTrue(Q4.newfibonacci(n) == Q4Answer.newfibonacci(n)); 
	}
	
	@Test(timeout=1200000)
	public void test4() {
		int n = 20; 
		assertTrue(Q4.newfibonacci(n) == Q4Answer.newfibonacci(n)); 
	}
	
	@Test(timeout=1200000)
	public void test5() {
		int n = 30; 
		assertTrue(Q4.newfibonacci(n) == Q4Answer.newfibonacci(n)); 
	}

}
