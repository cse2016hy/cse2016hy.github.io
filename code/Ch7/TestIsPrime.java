public class TestIsPrime
{ public static void main(String[] args)
  { int i = 0;
    System.out.println( isPrime(i));
  }

/** isPrime examines an integer > 1 to see if it is a prime.
  * @param n - the integer > 1
  * @return  1, if the integer is a prime;
  *  return the largest divisor of the integer, if it is not a prime;
  *  return -1, if the integer argument is invalid, that is, < 2.  */
public static int isPrime(int n)
{ int answer = -1;
  if ( n < 2 )
       { System.out.println("isPrime error: invalid argument " + n ); }
  else { boolean item_found = false;  
         int current = n/2;  // start search here for possible integer divisor
         while ( !item_found  &&  current > 1 )
               // invariant: 
               // (1) item_found == false  means  n  is not divisible
               //     by any of  n/2, (n/2)-1, ...down to... current+1
               // (2) item_found == true  means  current  divides  n
               { if ( n % current == 0 )
                      { item_found = true; }      // found a divisor
                 else { current = current - 1; }  // try again
               }
         if ( item_found )
              { answer = current; }  // current is the largest divisor of  n
         else { answer = 1; }        // n  is a prime
       }
  return answer;
}

}

