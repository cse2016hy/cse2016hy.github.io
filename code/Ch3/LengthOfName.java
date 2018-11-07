/** LengthOfName prints the length of its input program argument */
public class LengthOfName
{ public static void main(String[] args)
  { String name = args[0]; // the program argument is held in args[0]
    int length = name.length();
    System.out.println("The name, " + name + ", has length " + length);
  }
}

