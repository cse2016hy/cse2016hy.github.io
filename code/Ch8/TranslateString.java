import javax.swing.*;

class TranslateTable {

	private int[] encode; // 코드 -> 암호화된 코드 (encode[0]: ' '의 암호화된 코드값) 
	private int[] decode; // 암호화된 코드 -> 코드  

	// invariant: encode[i] = j <-> decode[j] = i

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
    		int code = (encode[i-1]+4) % 27; 
    		encode[i] = code;
    		decode[code] = i;
    	}
	   
    }
    
    private int c2i(char c) {
    	// 'a' = 97, 'b' = 98, 'c' = 99 ...
		// 'a' -> 1 
		// 'b' -> 2 
		// ' ' -> 0
    	if (c == ' ') return 0; 
    	return c - 'a' + 1; 
    	
    }

    private char i2c(int i) {
    	// 0 -> ' '
    	// 1 -> 'a' 
    	// 2 -> 'b' 
    	// ... 
    	if (i == 0) return ' ';
    	return (char) ('a' + i - 1);  
    }
    
    public char encode(char c) {
    	// 'a' -> 1, 'b' -> 2
    	// 2 -> 'b', 1 -> 'a' 
    	return i2c(encode[c2i(c)]); 
    }

    public String encode(String s) {
    	String result = ""; 
    	for (int i = 0; i < s.length(); i++) {
    		result = result + encode(s.charAt(i));  
    	}
    	return result; 
    }

    public char decode(char c) {
    	return i2c(decode[c2i(c)]); 
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
    	String original = JOptionPane.showInputDialog("암호화할 문장을 입력하세요.");
    	String encoded = m.encode(original);
    	String decoded = m.decode(encoded);
    	JOptionPane.showMessageDialog(null, "원본: " + original + "\n암호화: " + encoded + "\n복호화: " + decoded);
    	System.exit(0);
    }
}
