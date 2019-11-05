import static org.junit.Assert.*;

import org.junit.Test;

class TriangleAnswer {
	private int side1;
	private int side2;
	private int side3;
	
	public TriangleAnswer(int v1, int v2, int v3) {
		// fill here!
		side3 = Math.max(Math.max(v1, v2), v3);
		side1 = Math.min(Math.min(v1, v2), v3);
		side2 = v1 + v2 + v3 - side1 - side3; 
	}

	public boolean isRightAngled() {
		return side3 * side3 == side1 * side1 + side2 * side2;
	}
	public boolean isTwoEqualSided() {
		return side1 == side2 || side1 == side3 || side2 == side3; 
	}
	public boolean isAllEqualSided() {
		return side1 == side2 && side2 == side3; 
	}
	public boolean isAcute() {
		return side3 * side3 < side1 * side1 + side2 * side2;
	}
	public boolean isObtuse() {
		return side3 * side3 > side1 * side1 + side2 * side2;
	}
}
public class Q2test {

	@Test(timeout=1200000)
	public void test1() {
		Triangle t1 = new Triangle(3,5,3);
		TriangleAnswer t1a = new TriangleAnswer(3,5,3);
		assertTrue(t1.isRightAngled() == t1a.isRightAngled() );
		assertTrue(t1.isTwoEqualSided() == t1a.isTwoEqualSided());
		assertTrue(t1.isAllEqualSided() == t1a.isAllEqualSided());
		assertTrue(t1.isAcute() == t1a.isAcute());
		assertTrue(t1.isObtuse() == t1a.isObtuse());
	}
	
	@Test(timeout=1200000)
	public void test2() {
		Triangle t1 = new Triangle(12,9,15);
		TriangleAnswer t1a = new TriangleAnswer(12,9,15);
		assertTrue(t1.isRightAngled() == t1a.isRightAngled() );
		assertTrue(t1.isTwoEqualSided() == t1a.isTwoEqualSided());
		assertTrue(t1.isAllEqualSided() == t1a.isAllEqualSided());
		assertTrue(t1.isAcute() == t1a.isAcute());
		assertTrue(t1.isObtuse() == t1a.isObtuse());
	}
	
	@Test(timeout=1200000)
	public void test3() {
		Triangle t1 = new Triangle(4,4,4);
		TriangleAnswer t1a = new TriangleAnswer(4,4,4);
		assertTrue(t1.isRightAngled() == t1a.isRightAngled() );
		assertTrue(t1.isTwoEqualSided() == t1a.isTwoEqualSided());
		assertTrue(t1.isAllEqualSided() == t1a.isAllEqualSided());
		assertTrue(t1.isAcute() == t1a.isAcute());
		assertTrue(t1.isObtuse() == t1a.isObtuse());
	}
	
	@Test(timeout=1200000)
	public void test4() {
		Triangle t1 = new Triangle(9,12,14);
		TriangleAnswer t1a = new TriangleAnswer(9,12,14);
		assertTrue(t1.isRightAngled() == t1a.isRightAngled() );
		assertTrue(t1.isTwoEqualSided() == t1a.isTwoEqualSided());
		assertTrue(t1.isAllEqualSided() == t1a.isAllEqualSided());
		assertTrue(t1.isAcute() == t1a.isAcute());
		assertTrue(t1.isObtuse() == t1a.isObtuse());
	}
	
	@Test(timeout=1200000)
	public void test5() {
		Triangle t1 = new Triangle(12,9,16);
		TriangleAnswer t1a = new TriangleAnswer(12,9,16);
		assertTrue(t1.isRightAngled() == t1a.isRightAngled() );
		assertTrue(t1.isTwoEqualSided() == t1a.isTwoEqualSided());
		assertTrue(t1.isAllEqualSided() == t1a.isAllEqualSided());
		assertTrue(t1.isAcute() == t1a.isAcute());
		assertTrue(t1.isObtuse() == t1a.isObtuse());
	}


}
