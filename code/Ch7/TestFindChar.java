
public class TestFindChar
{ public static void main(String[] args)
  { 
	String target = "d";
	String input = "abcdef";
	char c = target.charAt(0);
    int location = findChar(c, input);
    System.out.println( location );
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

