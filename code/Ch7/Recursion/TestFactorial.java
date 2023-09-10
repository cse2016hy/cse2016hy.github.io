
public class TestFactorial
{
  public static void main(String[] args)
  { 
	// n : 3부터 시작해서 증가
	// n_2 : fib(n-2)
	// n_1 : fib(n-1)
	// fib(1)  fib(2)  fib(3)  fib(4)  fib(5) ...
	//                         n_2     n_1
	//               
	// n = 3 
	// n_1 = fib(2) = 1 
	// n_2 = fib(1) = 1
	// n = 4 
	// n_1 = fib(3) = n_1 + n_2 
	// n_2 = fib(2) = n_1 
	  
	for ( int i = 0;  i <= 20;  i = i+1 )
    // factorial: invariant: have printed the factorials for  0 ..upto.. (i-1)
    { 
	  System.out.println( i + "! = " +  factorial(i) ); 
    // fibonacci: invariant: have printed the fibonaccis for  0 ..upto.. (i-1)	
	  System.out.println( "fib(" + i + ") = " +  Fibonacci(i) ); 
	}
  }


/** factorial computes  n!  for  n  in the range 0..20.
  * (note: answers for  n > 20  are too large for Java to compute,
  *  and answers for  n < 0   make no sense.)
  * @param n - the input; should be in the range 0..20
  * @return  n!,  if  n in 0..20;  return -1, otherwise  */
public static long factorial(int n)
{ long answer;
  if ( n < 0  ||  n > 20 )
       { answer = -1; }                        // n is erroneous
  else { if ( n == 0 )
              { answer = 1; }                  // 0! = 1
         else { answer = n * factorial(n-1); } // n! = n*(n-1)!, for positive n
       }
  return answer;
}

public static int Fibonacci(int N)
{
    // If N is zero return zero
    if(N == 0)
    {
        return 0;
    }

    // If the value of N is one or two return 1
    if( N == 1 || N == 2)
    {
       return 1;
    }

    // Keep track of the fibonacci values for N-1 and N-2
    int N_1 = 1;
    int N_2 = 1;

    // From the bottom-up calculate all the fibonacci values until you 
    // reach the N-1 and N-2 values of the target Fibonacci(N)
    for(int i =3; i < N; i++)
    {
       int temp = N_2;
       N_2 = N_2 + N_1;
       N_1 = temp;
    }

    return N_1 + N_2; 
}
} 

