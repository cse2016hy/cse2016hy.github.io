class Person {
 private String name;
 public String getName() {return name;}
} 

class Student extends Person {
 private int id;
 public int getID() {return id;}
} 

class Faculty extends Person {
 private String id;
 public String getID() {return id;}
} 

public class Test1 {

	public static void main(String[] args) {
		Student s = new Student();
		Person p = new Person();
		Person q = new Person();
		Faculty f = new Faculty();
		Object o = new Faculty();
		String n = s.getName();
		p = s;
		int m = ((Student)p).getID();
		f = q;
		o = s; 

	}

}
