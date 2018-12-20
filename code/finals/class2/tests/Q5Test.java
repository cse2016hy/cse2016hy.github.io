import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

class Q5answer {
   public static void sort(String[] a) {
      int N = a.length;
      for (int i = 1; i < N; i++)
         for (int j = i; j > 0; j--)
            if (a[j-1].compareTo(a[j]) < 0) 
               exch(a, j-1, j);
            else break;
   }
   private static void exch(String[] a, int i, int j) {
      String swap = a[i];
      a[i] = a[j];
      a[j] = swap;
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

