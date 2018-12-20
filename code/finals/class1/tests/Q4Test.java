import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

class Q4answer {
	public static int[] computeFrequency(String s) {
		s = s.toLowerCase();
		int[] freq = new int[25];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int index = c - 'a';  
			 if (index >= 0 && index <= 24) 
				freq[index]++;
		}
		return freq; 
	}
}

public class Q4Test {

	@Test(timeout=5000)
	public void test1() {
		String s = "13asdv249";
		int[] answer = Q4answer.computeFrequency(s);
		int[] result = Q4.computeFrequency(s);
		for (int i = 0; i < 25; i++)
			assertTrue(answer[i] == result[i]);
	}
	
	@Test(timeout=5000)
	public void test2() {
		String s = "xc;VOIjawefj;;1---2";
		int[] answer = Q4answer.computeFrequency(s);
		int[] result = Q4.computeFrequency(s);
		for (int i = 0; i < 25; i++)
			assertTrue(answer[i] == result[i]);
	}
	
	@Test(timeout=5000)
	public void test3() {
		String s = "ABCDabcdERTert234[] {}<>";
		int[] answer = Q4answer.computeFrequency(s);
		int[] result = Q4.computeFrequency(s);
		for (int i = 0; i < 25; i++)
			assertTrue(answer[i] == result[i]);
	}
}

