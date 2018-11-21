
public class BinarySearch {
	public static int search(String key, String[] a)
	{
	   return search(key, a, 0, a.length);
	}
	public static int search(String key, String[] a, int lo, int hi)
	{
	   if (hi <= lo) return -1;
	   int mid = lo + (hi - lo) / 2;
	   int cmp = a[mid].compareTo(key);
	   if      (cmp > 0) return search(key, a, lo, mid);
	   else if (cmp < 0) return search(key, a, mid+1, hi);
	   else              return mid;
	}
	public static void main(String[] args) {
		String[] arr = new String[4];
		arr[0] = "a";
		arr[1] = "b";
		arr[2] = "c";
		arr[3] = "d";
		System.out.println(search("c", arr));
	}
}
