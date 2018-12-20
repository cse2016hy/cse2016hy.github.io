import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

class Q2answer {
	public static int getSum(Vector<Integer> v) {
		int sum = 0;
		for(int i = 0; i < v.size(); i++) {
			int n = v.elementAt(i);
			sum += n; 
		}
		return sum;  
	}
}

public class Q2Test {

	@Test(timeout=5000)
	public void test1() {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5); v.add(4); v.add(-1); v.add(-1); v.add(-1);
		assertEquals(Q2.getSum(v), Q2answer.getSum(v));
	}
	
	@Test(timeout=5000)
	public void test2() {
		Vector<Integer> v = new Vector<Integer>();
		v.add(-100); v.add(-100); v.add(200);
		assertEquals(Q2.getSum(v), Q2answer.getSum(v));
	}
	
	@Test(timeout=5000)
	public void test3() {
		Vector<Integer> v = new Vector<Integer>();
		v.add(123123); v.add(-100); v.add(134134);
		assertEquals(Q2.getSum(v), Q2answer.getSum(v));
	}

}

