import static org.junit.Assert.*;

import org.junit.Test;

class Q6answer {
	public static int getSum(Object[] arr) {
		int sum = 0; 
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] instanceof Integer)
				sum += (int) arr[i]; 
		}
		return sum;
	}
}

public class Q6Test {

	@Test
	public void test1() {
		Object[] a = new Object[5];
		a[0] = 10;
		a[1] = "a";
		a[2] = 2;
		a[3] = 2; 
		a[4] = "b";
		assertEquals(Q6.getSum(a), Q6answer.getSum(a));
	}
	
	@Test
	public void test2() {
		Object[] a = new Object[3];
		a[0] = 10;
		a[1] = "a";
		a[2] = 2;
		assertEquals(Q6.getSum(a), Q6answer.getSum(a));
	}
	
	@Test
	public void test3() {
		Object[] a = new Object[3];
		a[0] = "a";
		a[1] = 3;
		a[2] = 2;
		assertEquals(Q6.getSum(a), Q6answer.getSum(a));
	}

}

