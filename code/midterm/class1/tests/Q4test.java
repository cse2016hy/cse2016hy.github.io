
class PossibleExprsAnswer {
	public static int getPossible(int n) {
		int result = 0;
		if (n == 0) return 1;
		if (n >= 1) result += getPossible(n - 1);
		if (n >= 2) result += getPossible(n - 2);
		if (n >= 3) result += getPossible(n - 3);
		return result;
	}
	public static void main(String args[]) {
		System.out.println(getPossible(3));
		System.out.println(getPossible(4));
		System.out.println(getPossible(7));
		System.out.println(getPossible(10));
	}
}

public class Q4test {
	public void test(int n) {
		Field[] declaredFields = PossibleExprs.class.getDeclaredFields();
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

	    assertTrue(PossibleExprsAnswer.getPossible(n) == PossibleExprs.getPossible(n));
    }
    @Test(timeout=5000)
    public void test1() {
        test(5);
    }
    @Test(timeout=5000)
    public void test2() {
        test(10);
    }
    @Test(timeout=5000)
    public void test3() {
        test(17);
    }
    @Test(timeout=5000)
    public void test4() {
        test(20);
    }
    @Test(timeout=5000)
    public void test5() {
        test(30);
    }
}
