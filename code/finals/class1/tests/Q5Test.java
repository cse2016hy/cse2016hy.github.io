import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

class Q5answer {
   public static void sort(String[] a) {sort(a, 0, a.length);}
   public static void sort(String[] a, int lo, int hi) {
      int N = hi - lo;
      if (N <= 1) return;
      int mid = lo + N/2;
      sort(a, lo, mid);
      sort(a, mid, hi);
      String[] aux = new String[N];
	   int i = lo, j = mid;
	   for (int k = 0; k < N; k++) {
	      if      (i == mid) aux[k] = a[j++];
	      else if (j == hi)  aux[k] = a[i++];
	      else if (a[j].compareTo(a[i]) > 0) aux[k] = a[j++];  
	      else                               aux[k] = a[i++];
	   }
	   for (int k = 0; k < N; k++) a[lo + k] = aux[k];
   } 
}

public class Q5Test {

	@Test(timeout=5000)
	public void test1() {
		String[] arr1 = new String[4];
		arr1[0] = "adf"; arr1[1] = "bcd"; arr1[2] = "aaa"; arr1[3] = "baa";
		String[] arr2 = arr1.clone(); 
		Q5.sort(arr1);
		Q5answer.sort(arr2);
		assertTrue(Arrays.equals(arr1, arr2));
	}
	
	@Test(timeout=5000)
	public void test2() {
		String[] arr1 = new String[4];
		arr1[0] = "123"; arr1[1] = "121"; arr1[2] = "0"; arr1[3] = "43";
		String[] arr2 = arr1.clone(); 
		Q5.sort(arr1);
		Q5answer.sort(arr2);
		assertTrue(Arrays.equals(arr1, arr2));
	}
	
	@Test(timeout=5000)
	public void test3() {
		String[] arr1 = new String[4];
		arr1[0] = "123"; arr1[1] = "bcd"; arr1[2] = "1"; arr1[3] = "a";
		String[] arr2 = arr1.clone(); 
		Q5.sort(arr1);
		Q5answer.sort(arr2);
		assertTrue(Arrays.equals(arr1, arr2));
	}

}

