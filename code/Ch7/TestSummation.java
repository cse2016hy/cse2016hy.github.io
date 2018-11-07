public class TestSummation
{ public static void main(String[] args)
  { int i = new Integer(args[0]).intValue();
    System.out.println( summation(i));
  }

  /** summation computes a summation.
    * @param n - the upper bound of the summation; must be nonnegative 
    * @return the sum, 0+1+2+...+n */ 
  public static int summation(int n) 
  { int total = 0; // the running total 
    int i = 0; // counts from 1 to n 
    while ( i != n ) 
      // at each iteration: total == 0+1+...up to...+i 
      { System.out.println("i = " + i + "; total = " + total); 
        i = i + 1; 
        total = total + i; 
      } 
      // at loop's conclusion: total == 0+1+...up to...+n 
    System.out.println("Finished! summation(" + n + ") = " + total); 
    return total; 
  } 


}

