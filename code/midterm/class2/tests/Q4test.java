
public class Q4test {
    public static int fibonacci_analysis_answer(int n, int k) {
    if (n < k) return 0;
    else if (n == k) return 1;
    else 
      return fibonacci_analysis_answer(n - 1, k) + fibonacci_analysis_answer(n - 2, k); 
  }
    @Test(timeout=5000)
    public void test1() {
        int n, k;
        n = 40;
        k = 7;
      assertTrue(FibonacciAnalysis.fibonacci_analysis(n, k) == fibonacci_analysis_answer(n, k));
    }
    @Test(timeout=5000)
    public void test2() {
      int n, k;
        n = 30;
        k = 33;
      assertTrue(FibonacciAnalysis.fibonacci_analysis(n, k) == fibonacci_analysis_answer(n, k));
    }
    @Test(timeout=5000)
    public void test3() {
      int n, k;
        n = 20;
        k = 2;
      assertTrue(FibonacciAnalysis.fibonacci_analysis(n, k) == fibonacci_analysis_answer(n, k));
    }
    @Test(timeout=5000)
    public void test4() {
      int n, k;
        n = 30;
        k = 1;
      assertTrue(FibonacciAnalysis.fibonacci_analysis(n, k) == fibonacci_analysis_answer(n, k));
    }
    @Test(timeout=5000)
    public void test5() {
      int n, k;
        n = 10;
        k = 3;
      assertTrue(FibonacciAnalysis.fibonacci_analysis(n, k) == fibonacci_analysis_answer(n, k));
    }
}
