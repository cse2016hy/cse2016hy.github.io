class PersonTest3 {
	private String name;
	public PersonTest3(String n) {
		super();
		this.name = n;
	}
	public void setName(String n) {
		this.name = n;
	}
}
class StudentTest3 extends PersonTest3 {
	public StudentTest3() {
		this.setName("Student");
	}
}

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
