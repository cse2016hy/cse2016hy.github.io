import static org.junit.Assert.*;

import org.junit.Test;

class Q3Answer {
	public static int getOccurrence (String s, String sub) {
		int count = 0; 
		for (int i = 0; i <= s.length() - sub.length(); i++) {
			// fill here!
			// 다음을 사용: s.substring(i1,i2): 인덱스 i1 부터 인덱스 i2 - 1 까지 부분문자열 반환  
			if (sub.equals(s.substring(i, i + sub.length()))) count++; 
		}
		return count;
	}
}

public class Q3test {

	@Test(timeout=1200000)
	public void test1() {
		String s = "ab ab ab";
		String sub = "ab";
		assertTrue(Q3.getOccurrence(s, sub) == Q3Answer.getOccurrence(s, sub));
	}
	
	@Test(timeout=1200000)
	public void test2() {
		String s = "ababab";
		String sub = "aba";
		assertTrue(Q3.getOccurrence(s, sub) == Q3Answer.getOccurrence(s, sub));
	}

	@Test(timeout=1200000)
	public void test3() {
		String s = "abcdef";
		String sub = "xyz";
		assertTrue(Q3.getOccurrence(s, sub) == Q3Answer.getOccurrence(s, sub));
	}
	
	@Test(timeout=1200000)
	public void test4() {
		String s = "a1b2c3";
		String sub = "1b";
		assertTrue(Q3.getOccurrence(s, sub) == Q3Answer.getOccurrence(s, sub));
	}
	
	@Test(timeout=1200000)
	public void test5() {
		String s = "abababa";
		String sub = "ba";
		assertTrue(Q3.getOccurrence(s, sub) == Q3Answer.getOccurrence(s, sub));
	}
}
