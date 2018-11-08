
class GcdAnalysisAnswer {
	public static int findGCD_minus(int n, int m) {
		if (n < m) {int tmp = n; n = m; m = tmp;}
		if (m == n) return 1; 
		return 1 + findGCD_minus(n - m, m); 
	}
	public static int findGCD_mod(int n, int m) {
		if (n < m) {int tmp = n; n = m; m = tmp;}
		if (m == 0) return 1; 
		return 1 + findGCD_mod(m, n % m); 
	}
	
	public static int gcd_analysis(int n, int m) {
		return findGCD_minus(m, n) - findGCD_mod(m, n);
	}
	
	public static void main (String args[]) {
//		System.out.println(gcd_analysis(420, 96));
	}
}

public class Q3test {
    public void test(int n, int m) {
		Field[] declaredFields = GcdAnalysis.class.getDeclaredFields();
		for (Field field : declaredFields) {
			if (Modifier.isStatic(field.getModifiers()) && field.getType() == int.class) {
				field.setAccessible(true);
				try {
					field.setInt(null, 0);
				}
				catch (IllegalAccessException e) {
				}
			}
		}
	    assertTrue(GcdAnalysisAnswer.gcd_analysis(n,m) == GcdAnalysis.gcd_analysis(n,m));
    }
    @Test(timeout=5000)
    public void test1() {
        test(1096, 128);
    }
    @Test(timeout=5000)
    public void test2() {
        test(2048, 1024);
    }
    @Test(timeout=5000)
    public void test3() {
        test(54, 24);
    }
    @Test(timeout=5000)
    public void test4() {
        test(18392, 3948);
    }
    @Test(timeout=5000)
    public void test5() {
        test(38000, 12008);
    }
}
