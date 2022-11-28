

public class CodeKey implements Key {
	private String category;  
	private int code;  

	public CodeKey(String s, int i)
	 {  category = s;
	 	code = i;
	 }

	 public boolean equals(Key c)
	 { String s = ((CodeKey)c).getCategory();
	   int d = ((CodeKey)c).getCode();
	   return ( s.equals(category)  &&  d == code );
	 }
	 
	 public String getCategory() { return category; }
	 
	 public int getCode() { return code; }
	 
	 public String toString() { return this.getCategory() + this.getCode(); }
}
