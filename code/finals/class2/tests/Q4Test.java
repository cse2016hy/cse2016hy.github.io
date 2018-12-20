import static org.junit.Assert.*;

import org.junit.Test;

class Q4answer {
  public static int divide(String s) {
	 try {
	  int i = new Integer(s).intValue();
	  return (12 / i);
	 }
	 catch(NumberFormatException e) { // NumberFormatException
		 return -1;
	 }
	 catch(ArithmeticException e) { // ArithmeticException
		 return -2;
	 }
  }
}

public class Q4Test {
	@Test
	public void test1() {
		assertEquals(Q4.divide("3"), Q4answer.divide("3"));
	}
	@Test
	public void test2() {
		assertEquals(Q4.divide("0"), Q4answer.divide("0"));
	}
	@Test
	public void test3() {
		assertEquals(Q4.divide("#"), Q4answer.divide("#"));
	}
}

