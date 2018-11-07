public class FibonacciAnalysis {
  private static int record[] = new int[100];
  public static int fibonacci(int n) {
    record[n]++;
      if (n == 0) {
          return 0;
      } else if (n == 1) {
          return 1;
      } else {
          return fibonacci(n-1) + fibonacci(n-2);
      }
  }
  
  public static int fibonacci_analysis(int n, int k) {
    int tmp = fibonacci(n);
    return record[k];
  }
  
  public static void main (String args[]) {
    int x = fibonacci(40);
    System.out.println(record[7]);
    System.out.println(fibonacci_analysis(40, 7));
  }
}

