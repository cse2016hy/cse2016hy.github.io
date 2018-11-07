public class FibonacciAnalysis {
  public static int fibonacci_analysis(int n, int k) {
    if (n < k) return 0;
    else if (n == k) return 1;
    else 
      return fibonacci_analysis(n - 1, k) + fibonacci_analysis(n - 2, k); 
  }
  
  public static void main (String args[]) {
    int x = fibonacci(40);
    System.out.println(record[7]);
    System.out.println(fibonacci_analysis(40, 7));
  }
}

