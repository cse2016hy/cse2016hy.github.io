import static org.junit.Assert.*;

import org.junit.Test;

class Q3answer {
	public static int search(char key, String a, int lo, int hi)
	{
		if (hi <= lo) return -1;
	   int mid = lo + (hi - lo) / 2;
	   int cmp = a.charAt(mid) == key ? 0 : (a.charAt(mid) < key ? -1 : 1); 
	   if      (cmp > 0) return search(key, a, lo, mid);
	   else if (cmp < 0) return search(key, a, mid+1, hi);
	   else              return mid;
	}
	public static int findChar(char c, String s) { 
		return search(c, s, 0, s.length()); 
	}
}
public class Q3Test {

	@Test(timeout=5000)
	public void test1() {
		String s = "abcdefghi";
		assertEquals(Q3.findChar('c', s), Q3answer.findChar('c', s));
	}
	
	@Test(timeout=5000)
	public void test2() {
		String s = "abcdefghijklmnop";
		assertEquals(Q3.findChar('i', s), Q3answer.findChar('i', s));
	}
	
	@Test(timeout=5000)
	public void test3() {
		String s = "abcdefghijklmnopqrstuvwxyz";
		assertEquals(Q3.findChar('x', s), Q3answer.findChar('x', s));
	}

}

