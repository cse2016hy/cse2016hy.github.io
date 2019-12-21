import static org.junit.Assert.*;

import org.junit.Test;

public class Q2Test {

	public static int countFacultyAnswer(Person[] people, int money) {
		int cnt = 0;
		// fill here!
		if (people == null) return 0;
		for (int i = 0; i < people.length; i++) {
			if ((people[i] instanceof Faculty) && ((Faculty)people[i]).getSalary() >= money) {
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
		assertTrue(Q2.countFaculty(people, 75) == countFacultyAnswer(people, 75));
	}
	
	@Test
	public void test2() {
		assertTrue(Q2.countFaculty(null, 0) == countFacultyAnswer(null, 0));
	}
	
	@Test
	public void test3() {
		Person[] people = new Person[10];
		Undergrad s1 = new Undergrad("kim", 'A');
		Undergrad s2 = new Undergrad("lee", 'B');
		Undergrad s3 = new Undergrad("park", 'A');
		Faculty f1 = new Faculty("lee", 100);
		Faculty f2 = new Faculty("kim", 200);
		people[0] = s1; people[1] = null;
		people[2] = s3; people[3] = f1; people[4] = f2;
		assertTrue(Q2.countFaculty(people, 300) == countFacultyAnswer(people, 300));
	}
	
	@Test
	public void test4() {
		Person[] people = new Person[10];
		Faculty f1 = new Faculty("lee", 100);
		Faculty f2 = new Faculty("kim", 200);
		Faculty f3 = new Faculty("park", 300);
		people[0] = f1; people[1] = f2; people[2] = f3;
		assertTrue(Q2.countFaculty(people, 200) == countFacultyAnswer(people, 200));
	}

	@Test
	public void test5() {
		Person[] people = new Person[10];
		Undergrad s1 = new Undergrad("kim", 'B');
		Undergrad s2 = new Undergrad("lee", 'B');
		Undergrad s3 = new Undergrad("park", 'B');
		people[0] = s1; people[1] = s2; people[1] = s3;
		assertTrue(Q2.countFaculty(people, 0) == countFacultyAnswer(people, 0));
	}

}