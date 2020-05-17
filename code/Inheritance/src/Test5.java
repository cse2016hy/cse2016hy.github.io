class PersonTest5 {
	public void method1() {
		System.out.println("Person 1");
	}
	public void method2() {
		System.out.println("Person 2");
	}
}

class StudentTest5 extends PersonTest5 {
	public void method1() {
		System.out.println("Student 1");
		super.method1();
		this.method2();
	}
	public void method2() {
		System.out.println("Student 2");
	}
}
class UndergradTest5 extends StudentTest5 {
	public void method2() {
		System.out.println("Undergrad 2");
	}
}

public class Test5 {
	public static void main(String[] args) {
		PersonTest5 u = new UndergradTest5();
		u.method1();
		
	}
}
