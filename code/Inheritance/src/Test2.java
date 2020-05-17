class PersonTest {
	private String name;
	public PersonTest(String n) {
		this.name = n;
		super();		
		System.out.print("#1");
	}
}

class StudentTest extends PersonTest {
	public StudentTest() {
		this("Student");
		System.out.print("#2");
	}
	public StudentTest(String n) {
		super(n);
		System.out.print("#3");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentTest a = new StudentTest();
	}

}
