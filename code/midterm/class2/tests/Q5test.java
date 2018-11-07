
public class Q5test {
    public static int getMinimal_answer(int x) {
    int m1 = Integer.MAX_VALUE, m2 = Integer.MAX_VALUE, m3 = Integer.MAX_VALUE;
    if (x == 1) return 0;
    if (x % 3 == 0) {
      m1 = 1 + getMinimal_answer(x / 3);
    }
    if (x % 2 == 0) {
      m2 = 1 + getMinimal_answer(x / 2);
    }
    m3 = 1 + getMinimal_answer(x - 1); 
    return Math.min(Math.min(m1, m2), m3);
  }
    @Test(timeout=50000)
    public void test1() {
        int x = 10;
      assertTrue(MakingOne.getMinimal(x) == getMinimal_answer(x));
    }
    @Test(timeout=50000)
    public void test2() {
      int x = 200;
      assertTrue(MakingOne.getMinimal(x) == getMinimal_answer(x));
    }
    @Test(timeout=50000)
    public void test3() {
      int x = 333;
      assertTrue(MakingOne.getMinimal(x) == getMinimal_answer(x));
    }
    @Test(timeout=50000)
    public void test4() {
      int x = 486;
      assertTrue(MakingOne.getMinimal(x) == getMinimal_answer(x));
    }
    @Test(timeout=50000)
    public void test5() {
      int x = 500;
      assertTrue(MakingOne.getMinimal(x) == getMinimal_answer(x));
    }
}
