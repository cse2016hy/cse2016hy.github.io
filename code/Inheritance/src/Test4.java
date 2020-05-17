class PersonTest4 {
	private String name;
	public PersonTest4(String name) {
		this.name = name;
	}
	public boolean isAsleep(int hr) {
		return 22 < hr && 7 > hr; 
	}
	public String toString() { return name; }
	public void status(int hr) {
		if (this.isAsleep(hr)) {
			System.out.println("취침중: " + this);
		}
		else {
			System.out.println("깼음: " + this);
		}
	}
}

class StudentTest4 extends PersonTest4 {
	public StudentTest4 (String name) {
		super(name);
	}
	public boolean isAsleep(int hr) {
		return 2 < hr && 8 > hr; 
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonTest4 p;
		p = new StudentTest4("지윤");
		p.status(1);
	}

}
