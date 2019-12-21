public class Q6 {
	public static int countNumberStrings(String[] strs) {
		// fill here!
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
	public static void main(String[] args) {
		String[] strs = {"123", "abc", "12", "", null};
		System.out.println(countNumberStrings(strs)); // 2
	}
}
