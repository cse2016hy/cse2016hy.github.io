
public class Q3 {
	public static int getOccurrence (String s, String sub) {
		int count = 0; 
		for (int i = 0; i <= s.length() - sub.length(); i++) {
			// fill here!
			// 다음을 사용: s.substring(i1,i2): 인덱스 i1 부터 인덱스 i2 - 1 까지 부분문자열 반환  
			if (sub.equals(s.substring(i, i + sub.length()))) count++; 
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(getOccurrence("abcd ab", "ab")); // 2
		System.out.println(getOccurrence("bbbb", "bb")); // 3
	}
}
