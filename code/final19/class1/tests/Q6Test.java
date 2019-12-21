import static org.junit.Assert.*;

import org.junit.Test;

public class Q6Test {
	public static int countNumberStringsAnswer(String[] strs) {
		int cnt = 0; 
		if (strs == null) return 0;
		for (int i = 0; i < strs.length; i++) {
			try {
				int n = Integer.parseInt(strs[i]);
				cnt++;
			}
			catch (RuntimeException e) {
			}
		}
		return cnt; 
	}
	
	@Test
	public void test1() {
		String[] strs = {"123", "abc", "12", "", null};
		assertTrue(Q6.countNumberStrings(strs) == countNumberStringsAnswer(strs)); // 2
	}
	
	@Test
	public void test2() {
		String[] strs = null;
		assertTrue(Q6.countNumberStrings(strs) == countNumberStringsAnswer(strs)); // 2
	}
	
	@Test
	public void test3() {
		String[] strs = {null};
		assertTrue(Q6.countNumberStrings(strs) == countNumberStringsAnswer(strs)); // 2
	}
	
	@Test
	public void test4() {
		String[] strs = {"a", "b", "c"};
		assertTrue(Q6.countNumberStrings(strs) == countNumberStringsAnswer(strs)); // 2
	}
	
	@Test
	public void test5() {
		String[] strs = {"1", "2b", "2"};
		assertTrue(Q6.countNumberStrings(strs) == countNumberStringsAnswer(strs)); // 2
	}

}
