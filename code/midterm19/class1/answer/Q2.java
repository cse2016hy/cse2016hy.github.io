class Triangle {
	private int side1;
	private int side2;
	private int side3;
	
	public Triangle(int v1, int v2, int v3) {
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

public class Q2 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(3,5,4); 
		System.out.println(t1.isRightAngled()); // true
		System.out.println(t1.isObtuse()); // false
		System.out.println(t1.isAllEqualSided()); // false
		Triangle t2 = new Triangle(10,3,4); 
		System.out.println(t2.isRightAngled()); // false
		System.out.println(t2.isObtuse()); // true
		System.out.println(t2.isAllEqualSided()); // false
	}
}
