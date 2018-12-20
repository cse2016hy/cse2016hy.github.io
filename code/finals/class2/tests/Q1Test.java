import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

class Q1answer {
	public static int getSum(int[] v) {
		int sum = 0;
		for(int i =0; i < v.length; i++) {
			int n = v[i]; 
			sum += n; 
		}
		return sum; 
	}
}

public class Q1Test {

	@Test(timeout=5000)
	public void test1() {
		int[] v = {1, 2, 3, -1, -2, 0};
		assertEquals(Q1.getSum(v), Q1answer.getSum(v));
	}
	
	@Test(timeout=5000)
	public void test2() {
		int[] v = {-100, -200, -300};
		assertEquals(Q1.getSum(v), Q1answer.getSum(v));
	}
	
	@Test(timeout=5000)
	public void test3() {
		int[] v = {-100, 100, -200, 200, -300, 300};
		assertEquals(Q1.getSum(v), Q1answer.getSum(v));
	}

}

