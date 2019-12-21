import static org.junit.Assert.*;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Q2Test {

	public static int countUndergradAnswer(Person[] people, char grade) {
		int cnt = 0;
		// fill here!
		if (people == null) return 0;
		for (int i = 0; i < people.length; i++) {
			if ((people[i] instanceof Undergrad) && ((Undergrad)people[i]).getGrade() == grade) {
				cnt++;
			}
		}
		return cnt;
	}
	
	@Test
	public void test1() {
		Person[] people = new Person[10];
		Undergrad s1 = new Undergrad("kim", 'A');
		Undergrad s2 = new Undergrad("lee", 'B');
		Undergrad s3 = new Undergrad("park", 'A');
		Faculty f1 = new Faculty("lee", 100);
		Faculty f2 = new Faculty("kim", 200);
		people[0] = s1; people[1] = s2;
		people[2] = s3; people[3] = f1; people[4] = f2;
		assertTrue(Q2.countUndergrad(people, 'A') == countUndergradAnswer(people, 'A'));
	}
	
	@Test
	public void test2() {
		assertTrue(Q2.countUndergrad(null, 'A') == countUndergradAnswer(null, 'A'));
	}
	
	@Test
	public void test3() {
		Person[] people = new Person[10];
		Undergrad s1 = new Undergrad("kim", 'A');
		Undergrad s2 = new Undergrad("lee", 'B');
		Undergrad s3 = new Undergrad("park", 'A');
		Faculty f1 = new Faculty("lee", 100);
		Faculty f2 = new Faculty("kim", 200);
		people[0] = s1; people[1] = s2;
		people[2] = s3; people[3] = f1; people[4] = f2;
		assertTrue(Q2.countUndergrad(people, 'B') == countUndergradAnswer(people, 'B'));
	}
	
	@Test
	public void test4() {
		Person[] people = new Person[10];
		Faculty f1 = new Faculty("lee", 100);
		Faculty f2 = new Faculty("kim", 200);
		people[0] = f1; people[1] = f2;
		assertTrue(Q2.countUndergrad(people, 'A') == countUndergradAnswer(people, 'A'));
	}

	@Test
	public void test5() {
		Person[] people = new Person[10];
		Undergrad s1 = new Undergrad("kim", 'B');
		Undergrad s2 = new Undergrad("lee", 'B');
		Undergrad s3 = new Undergrad("park", 'B');
		people[0] = s1; people[1] = s2; people[1] = s3;
		assertTrue(Q2.countUndergrad(people, 'B') == countUndergradAnswer(people, 'B'));
	}

}