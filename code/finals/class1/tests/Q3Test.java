import static org.junit.Assert.*;

import org.junit.Test;

class Q3answer {
	public static int search(int key, int[] a) {
	   return search(key, a, 0, a.length);
	}
	public static int search(int key, int[] a, int lo, int hi)
	{
	   if (hi <= lo) return -1;
	   int mid = lo + (hi - lo) / 2;
	   int cmp = a[mid] == key ? 0 : (a[mid] < key ? -1 : 1); 
	   if      (cmp > 0) return search(key, a, lo, mid);
	   else if (cmp < 0) return search(key, a, mid+1, hi);
	   else              return mid;
	}
}

public class Q3Test {

	@Test(timeout=5000)
	public void test1() {
		int[] arr = {1, 2, 3, 4, 5};
		assertEquals(Q3.search(5, arr), Q3answer.search(5, arr));
	}
	
	@Test(timeout=5000)
	public void test2() {
		int[] arr = {1, 2, 3, 4, 5};
//		assertEquals(Q3.search(-1, arr), Q3answer.search(-1, arr));
		try {
		int answer = Q3.search(-1, arr);
		assertTrue(answer < 0 ||  answer > 4);
	    } catch (Exception e) { assertTrue(true); }
	}
	
	@Test(timeout=5000)
	public void test3() {
		int[] arr = {1, 2, 3, 4, 5};
		assertEquals(Q3.search(2, arr), Q3answer.search(2, arr));
	}

}

