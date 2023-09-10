
public class TestFindChar
{ 
	public static int isPrime(int n)
	{
		if (n<2) throw new RuntimeException("error: invalid " + n );
		boolean found = false; // 인수를 찾았니?
		int c = n/2; // 현재 검색 중인 것
		while (!found && c>1) {
			// 루프 불변식:
			// (1) found==false 경우, n이 c+1...n/2로 나누어 지지 않는다.
			// (2) found==true 경우, n이 c로 나누어진다.
			if (n%c == 0) found = true;
			else c = c-1;
		}
		if (!found) return 1; // 못찾은 경우 1을 반환
		return c;
	}
	public static int isPrimeFor(int n) {
		int c;
		for(c=n/2; c>1 && n%c!=0; c=c-1);
		return c;
	}
	
	public static int findCharFor(char c, String s)
	{
		int index;
		for(index=0; index<s.length() && s.charAt(index)!=c; index++);
		if (index==s.length()) index = -1;
		return index;
	}
	
  public static void main(String[] args)
  { 
	  int i; 
	  for (i = 0; i < 10; i++); 
	  System.out.println(i);
	  
//	  System.out.println( isPrime(17));
	  
//	String target = "abcdef";
//	char c = 'd';
//    int location = findChar(c, target);
//    System.out.println( location );
  }

/** findChar locates the leftmost occurrence of a character in a string.
  * @param c - the character to be found
  * @param s - the string to be searched
  * @return the index of the leftmost occurrence of  c  in  s;
  *  return -1 if  c  does not occur in  s  */
public static int findChar(char c, String s)
{ boolean found = false;  // remembers if  c  has been found in  s
  int index = 0;          // where to look within  s  for  c
  while ( !found  &&  index < s.length() )
        // invariant:
        // (1) found == false  means  c  is not any of chars 0..(index-1) in  s 
        // (2) found == true  means that  c  is  s.charAt(index)
        { if ( s.charAt(index) == c )
               { found = true; }
          else { index = index + 1; }
        }
  if ( !found )  // did the loop fail to find  c  in all of  s?
     { index = -1; }
  return index;
}

}

