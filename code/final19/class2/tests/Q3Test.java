import static org.junit.Assert.*;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.junit.Test;

public class Q3Test {
	public static int getPayrollAnswer(String line) {
		if (line == null) return -1;
		try {
			StringTokenizer t = new StringTokenizer(line, "|");
			String s = t.nextToken().trim();
			if (t.countTokens() != 2) return -2;
			int hours = new Integer(t.nextToken().trim()).intValue();
			int payrate = new Integer(t.nextToken().trim()).intValue();
			return hours * payrate;
		}
		catch (NoSuchElementException e) {
			return -2;
		}
		catch (RuntimeException e) {
			return 0;
		}
		
	}
	@Test
	public void test1() {
		String s = "student lee|20|40"; 
		assertTrue(Q3.getPayroll(s) == getPayrollAnswer(s));
	}
	@Test
	public void test2() {
		String s = " a b c | "; 
		assertTrue(Q3.getPayroll(s) == getPayrollAnswer(s));
	}
	@Test
	public void test3() {
		String s = null; 
		assertTrue(Q3.getPayroll(s) == getPayrollAnswer(s));
	}
	@Test
	public void test4() {
		String s = "ab cd| 2 | 4a"; 
		assertTrue(Q3.getPayroll(s) == getPayrollAnswer(s));
	}
	@Test
	public void test5() {
		String s = "ab cd| 2 | 4a | 2 | 9"; 
		assertTrue(Q3.getPayroll(s) == getPayrollAnswer(s));
	}

}
