
import static org.junit.Assert.*;

import java.util.StringTokenizer;

import org.junit.Test;

class Q7answer { 
	public static int getPayroll(String line) {
		try {
			StringTokenizer t = new StringTokenizer(line, "|");
			String s = t.nextToken().trim();
			int hours = new Integer(t.nextToken().trim()).intValue();
			int payrate = new Integer(t.nextToken().trim()).intValue();
			return hours * payrate;
		}
		catch (RuntimeException e) {
			return -1;
		}
	}
}

public class Q7Test {

	@Test
	public void test1() {
		String s = "1 | 2 | 10";
		assertEquals(Q7.getPayroll(s), Q7answer.getPayroll(s));
	}
	
	@Test
	public void test2() {
		String s = "|";
		assertEquals(Q7.getPayroll(s), Q7answer.getPayroll(s));
	}
	
	@Test
	public void test3() {
		String s = "a | a | b";
		assertEquals(Q7.getPayroll(s), Q7answer.getPayroll(s));
	}

}

