
import static org.junit.Assert.*;

import org.junit.Test;

class Q7answer {
	public static boolean isPrime(int n) { 
		boolean answer = true;
		if ( n < 2 || n > 1000000) throw new RuntimeException(Integer.toString(n)); 
		boolean item_found = false;  
        int current = n / 2;
        while ( !item_found  &&  current > 1 ) { 
        	if ( n % current == 0 ) item_found = true;
        	else current = current - 1; 
        }
        if ( item_found ) answer = false; 
		return answer;
	}
	public static void main(String[] args) { 
		System.out.println(isPrime(11)); // true
		System.out.println(isPrime(1000001)); // RuntimeException
		System.out.println(isPrime(1)); // RuntimeException
	}
}

public class Q7Test {

	@Test
	public void test1() {
		assertEquals(Q7.isPrime(17), Q7answer.isPrime(17));
	}
	
	@Test(expected=RuntimeException.class)
	public void test2() {
		assertEquals(Q7.isPrime(-1), Q7answer.isPrime(-1));
	}
	
	@Test(expected=RuntimeException.class)
	public void test3() {
		assertEquals(Q7.isPrime(2000001), Q7answer.isPrime(2000001));
	}
}

