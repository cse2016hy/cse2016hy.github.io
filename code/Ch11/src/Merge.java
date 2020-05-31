
public class Merge {
   public static void sort(String[] a) {sort(a, 0, a.length);}
   // Sort a[lo, hi).
   public static void sort(String[] a, int lo, int hi) {
      int N = hi - lo;
      if (N <= 1) return;
      // Recursively sort left and right halves.
      int mid = lo + N/2;
      sort(a, lo, mid);
      sort(a, mid, hi);
      // Merge sorted halves
      String[] aux = new String[N];
	   // Merge into auxiliary array.
	   int i = lo, j = mid;
	   for (int k = 0; k < N; k++) {
	      if      (i == mid) aux[k] = a[j++];
	      else if (j == hi)  aux[k] = a[i++];
	      else if (a[j].compareTo(a[i]) < 0) aux[k] = a[j++];
	      else                               aux[k] = a[i++];
	   }
	   // Copy back.
	   for (int k = 0; k < N; k++) a[lo + k] = aux[k];
   } 
   public static void main(String[] args) {
	   String[] arr = new String[4];
		arr[0] = "d";	
		arr[1] = "a";
		arr[2] = "c";
		arr[3] = "b";
		sort(arr);
		for (int i = 0; i<arr.length; i++) 
			System.out.println(arr[i]);
   }
}