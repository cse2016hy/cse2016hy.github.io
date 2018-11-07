import javax.swing.*;
/** class SubstitutionCode */
public class SubstitutionCode
{
  public static void main(String[] args)
  { int[] code = new int[27];   // this is the translation table:
                                // code[0] holds the code for ' ',
                                // code[1] holds the code for 'a',
                                // code[2] holds the code for 'b', and so on
    int k = 34 ;  // we start with a ``seed'' integer and fill the table:
    code[0] = k;
    for ( int i = 1;  i != code.length;  i = i+1 )
        { code[i] = (int)((code[i-1] * 1.3) + 1); }
    String input_line = JOptionPane.showInputDialog
			            ("type sentence to encode:");
	for ( int j = 0;  j != input_line.length();  j = j+1)
        { char c = input_line.charAt(j);
          if ( c == ' ' )
               { System.out.println(code[0]); }
          else if ( c >= 'a'  &&  c <= 'z' )
               { int index = (c - 'a') + 1;
                 System.out.println(code[index]);
               }
          else { System.out.println("error: bad input character"); }
        }
  }
}



