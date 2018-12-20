import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

class Q1answer {
	public static String reverse(String s) {
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result = result + s.charAt(i);
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(reverse("abcd")); // dbca
	}	
}

public class Q1Test {

	@Test(timeout=5000)
	public void test1() {
		String s = "rewqrewq";
		assertEquals(Q1.reverse(s), Q1answer.reverse(s)); 
	}
	
	@Test(timeout=5000)
	public void test2() {
		String s = "abcd123873 asdfzxcv";
		assertEquals(Q1.reverse(s), Q1answer.reverse(s)); 
	}
	
	@Test(timeout=5000)
	public void test3() {
		String s = "123 :{}:;l,cv";
		assertEquals(Q1.reverse(s), Q1answer.reverse(s)); 
	}

}

