import static org.junit.jupiter.api.Assertions.*;
import static java.time.Duration.*;
import org.junit.jupiter.api.Test;

class InsertionTest {
	@Test
	void testSort() {
		String[] arr = new String[4];
		arr[0] = "d";
		arr[1] = "a";
		arr[2] = "c";
		arr[3] = "b"; 
		Insertion.sort(arr);
		assertTimeout(ofMillis(5), () -> {
			for (int i = 0; i < 3; i++)
				assertTrue(arr[i].compareTo(arr[i+1]) < 0);
		});
	}

}
