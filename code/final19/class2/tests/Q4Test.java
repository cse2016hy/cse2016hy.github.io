import static org.junit.Assert.*;

import org.junit.Test;

class TranslateTableAnswer {
	private int[] encode; // 코드 -> 암호화된 코드 (encode[0]: 0의 암호화된 코드값) 
	private int[] decode; // 암호화된 코드 -> 코드  
	public TranslateTableAnswer(int seed) {
		// fill here!
		encode = new int[10];
		decode = new int[10];
		encode[0] = seed; 
		decode[seed] = 0; 
		for (int i = 1; i < encode.length; i++) {
			int code = (encode[i-1] + 3) % encode.length;
			encode[i] = code; 
			decode[code] = i;
		}
	}
	private int c2i(char c) {
		// fill here!
		return c - '0';
	}
	private char i2c(int i) {
		// fill here!
		return (char)(i + '0');
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

public class Q4Test {

	@Test
	public void test1() {
		TranslateTable m = new TranslateTable(1);
		TranslateTableAnswer ms = new TranslateTableAnswer(1);
		String original = "0123456789";
		String encoded = m.encode(original);
		String decoded = m.decode(encoded);
		String encodeds = ms.encode(original);
		String decodeds = ms.decode(encoded);
		assertTrue(encoded.equals(encodeds));
		assertTrue(decoded.equals(decodeds));
	}
	@Test
	public void test2() {
		int seed = 2;
		TranslateTable m = new TranslateTable(seed);
		TranslateTableAnswer ms = new TranslateTableAnswer(seed);
		String original = "0369";
		String encoded = m.encode(original);
		String decoded = m.decode(encoded);
		String encodeds = ms.encode(original);
		String decodeds = ms.decode(encoded);
		assertTrue(encoded.equals(encodeds));
		assertTrue(decoded.equals(decodeds));
	}
	@Test
	public void test3() {
		int seed = 5;
		TranslateTable m = new TranslateTable(seed);
		TranslateTableAnswer ms = new TranslateTableAnswer(seed);
		String original = "1820192";
		String encoded = m.encode(original);
		String decoded = m.decode(encoded);
		String encodeds = ms.encode(original);
		String decodeds = ms.decode(encoded);
		assertTrue(encoded.equals(encodeds));
		assertTrue(decoded.equals(decodeds));
	}
	
	@Test
	public void test4() {
		int seed = 9;
		TranslateTable m = new TranslateTable(seed);
		TranslateTableAnswer ms = new TranslateTableAnswer(seed);
		String original = "1029102939";
		String encoded = m.encode(original);
		String decoded = m.decode(encoded);
		String encodeds = ms.encode(original);
		String decodeds = ms.decode(encoded);
		assertTrue(encoded.equals(encodeds));
		assertTrue(decoded.equals(decodeds));
	}
	
	@Test
	public void test5() {
		int seed = 7;
		TranslateTable m = new TranslateTable(seed);
		TranslateTableAnswer ms = new TranslateTableAnswer(seed);
		String original = "0193019201920";
		String encoded = m.encode(original);
		String decoded = m.decode(encoded);
		String encodeds = ms.encode(original);
		String decodeds = ms.decode(encoded);
		assertTrue(encoded.equals(encodeds));
		assertTrue(decoded.equals(decodeds));
	}

}
