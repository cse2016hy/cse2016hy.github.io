import static org.junit.Assert.*;

import org.junit.Test;

class Q2answer {
	public static String getConcat(String[] v) {
		String result = "";
		for(int i = 0; i < v.length; i++) {
			if (v[i] != null)
				result += v[i].toUpperCase();
		}
		return result;  
	}
}

public class Q2Test {

	@Test(timeout=5000)
	public void test1() {
		String[] v = new String[3];
		v[0] = "ab";
		v[2] = "ca";
		assertEquals(Q2.getConcat(v), Q2answer.getConcat(v)); 
	}
	
	@Test(timeout=5000)
	public void test2() {
		String[] v = new String[5];
		v[2] = "bc";
		v[4] = "BC";
		assertEquals(Q2.getConcat(v), Q2answer.getConcat(v)); 
	}
	
	@Test(timeout=5000)
	public void test3() {
		String[] v = new String[7];
		v[0] = "ab";
		v[4] = "aw";
		assertEquals(Q2.getConcat(v), Q2answer.getConcat(v)); 
	}

}
