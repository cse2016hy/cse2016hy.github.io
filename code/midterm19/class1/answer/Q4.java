
public class Q4 {
	public static int fibonacci(int n) {
		// fill here!
		if (n == 1 || n == 2) return 1; 
		return fibonacci(n - 2) + fibonacci(n - 1); 
	}
	
	public static int newfibonacci(int n) {
		// fill here!
		if (n == 1 || n == 2 || n == 3) return 1; 
		return newfibonacci(n - 3) + newfibonacci(n - 1); 
	}
	public static void main(String[] args) {
		System.out.println(fibonacci(30)); // 55
		System.out.println(newfibonacci(30)); // 19
	}

}
