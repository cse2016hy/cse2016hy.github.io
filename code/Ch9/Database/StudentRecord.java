


public class StudentRecord implements Record {
	// the names of the fields describe their contents:
	  private Key student_id;
	  private String name;

	  public StudentRecord(Key sid, String n)
	  { student_id = sid; 
	  	name = n; 
	  }

	  public Key getKey() { return student_id; }
	  
	  public String getName() { return name; }
	  
	  public String toString() { return student_id.toString() + " " + name; }
}

