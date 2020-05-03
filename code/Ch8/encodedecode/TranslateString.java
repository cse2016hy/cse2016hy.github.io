package encodedecode;

import javax.swing.JOptionPane;

class TranslateTable {
	private int[] encode; // 코드 -> 암호화된 코드 (encode[0]: ' '의 암호화된 코드값) 
	private int[] decode; // 암호화된 코드 -> 코드  

	// invariant: encode[0] = 5 <-> decode[5] = 0
	
	public TranslateTable(int seed) {
		// if seed = 1
		// ' ' -> a 
		// a -> e 
		// b -> i 
		// c -> m
		// d -> q
		// e -> u
		// f -> y
		// g -> b
		// ... 
		//
		encode = new int[27];
		decode = new int[27];
		encode[0] = seed; 
		decode[seed] = 0; 
		for (int i = 1; i < encode.length; i++) {
			int code = (encode[i-1] + 4) % encode.length;
			encode[i] = code; 
			decode[code] = i;
		}		
		
	}
	private char i2c(int i) {
		if (i == 0) return ' '; 
		return (char)('a' + i - 1); 
	}
	private int c2i(char c) {
		// 'a' = 97
		// 'a' -> 1 
		// 'b' -> 2 
		// ' ' -> 0
		if ( c == ' ' ) return 0; 
		return c - 'a' + 1; 
		
	}
	
	private char encode(char c) {
		return i2c(encode[c2i(c)]);
	}
	
	private char decode(char c) {
		return i2c(decode[c2i(c)]);
	}
	
	public String encode(String s) {
		String result = ""; 
		for (int i = 0; i < s.length(); i++) {
			result = result + encode(s.charAt(i));
		}
		return result; 
	}
	public String decode(String s) {
		String result = ""; 
		for (int i = 0; i < s.length(); i++) {
			result = result + decode(s.charAt(i));
		}
		return result; 
	}
}

public class TranslateString {

	public static void main(String[] args) {
		TranslateTable m = new TranslateTable(1);
		String original = JOptionPane.showInputDialog("암호화할 문장을 입력하세요. ");
		String encoded = m.encode(original);
		String decoded = m.decode(encoded);
		JOptionPane.showMessageDialog(null, "original " + original + "\n encoded: " + encoded + "\n decoded: " + decoded);
	}

}
