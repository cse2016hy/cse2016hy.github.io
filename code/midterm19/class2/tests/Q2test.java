import static org.junit.Assert.*;

import org.junit.Test;

class ComplexAnswer {
	private double real;
	private double imaginary; 
	
	public ComplexAnswer(double a, double b) {
		real = a;
		imaginary = b; 
	}
	
	public ComplexAnswer add(ComplexAnswer other) {
		double new_real; // 결과로 반환할 객체의 실수부 
		double new_imaginary; // 결과로 반환할 객체의 허수부
		// fill here! 
		new_real = real + other.getReal(); 
		new_imaginary = imaginary + other.getImaginary();
		ComplexAnswer result = new ComplexAnswer(new_real, new_imaginary); 
		return result; 
	}
	public ComplexAnswer sub(ComplexAnswer other) {
		// fill here!
		double new_real; // 결과로 반환할 객체의 실수부 
		double new_imaginary; // 결과로 반환할 객체의 허수부
		new_real = real - other.getReal(); 
		new_imaginary = imaginary - other.getImaginary();
		ComplexAnswer result = new ComplexAnswer(new_real, new_imaginary); 
		return result;
	}
	public ComplexAnswer mul(ComplexAnswer other) {
		// fill here!
		double new_real; // 결과로 반환할 객체의 실수부 
		double new_imaginary; // 결과로 반환할 객체의 허수부
		new_real = real * other.getReal() - imaginary * other.getImaginary(); 
		new_imaginary = real * other.getImaginary() + imaginary * other.getReal();
		ComplexAnswer result = new ComplexAnswer(new_real, new_imaginary); 
		return result;
	}
	public double getReal() {
		// fill here!
		return real;
	}
	public double getImaginary() {
		// fill here!
		return imaginary;
	}
}

public class Q2test {

	@Test(timeout=5000)
	public void test1() {
		Complex c1 = new Complex(-3, 1);
		Complex c2 = new Complex(5, 4);
		Complex c1_add_c2 = c1.add(c2);
		Complex c1_sub_c2 = c1.sub(c2);
		Complex c1_mul_c2 = c1.mul(c2);
		
		ComplexAnswer c1a = new ComplexAnswer(-3, 1);
		ComplexAnswer c2a = new ComplexAnswer(5, 4);
		ComplexAnswer c1_add_c2a = c1a.add(c2a);
		ComplexAnswer c1_sub_c2a = c1a.sub(c2a);
		ComplexAnswer c1_mul_c2a = c1a.mul(c2a);
		
		assertTrue(c1_add_c2.getReal() ==  c1_add_c2a.getReal());
		assertTrue(c1_sub_c2.getReal() ==  c1_sub_c2a.getReal());
		assertTrue(c1_mul_c2.getReal() ==  c1_mul_c2a.getReal());
	}
	
	@Test(timeout=5000)
	public void test2() {
		double r1 = 0.0;
		double i1 = 0.0; 
		double r2 = 0.0;
		double i2 = 0.0;
		Complex c1 = new Complex(r1, i1);
		Complex c2 = new Complex(r2, i2);
		Complex c1_add_c2 = c1.add(c2);
		Complex c1_sub_c2 = c1.sub(c2);
		Complex c1_mul_c2 = c1.mul(c2);
		
		ComplexAnswer c1a = new ComplexAnswer(r1, i1);
		ComplexAnswer c2a = new ComplexAnswer(r2, i2);
		ComplexAnswer c1_add_c2a = c1a.add(c2a);
		ComplexAnswer c1_sub_c2a = c1a.sub(c2a);
		ComplexAnswer c1_mul_c2a = c1a.mul(c2a);
		
		assertTrue(c1_add_c2.getReal() ==  c1_add_c2a.getReal());
		assertTrue(c1_sub_c2.getReal() ==  c1_sub_c2a.getReal());
		assertTrue(c1_mul_c2.getReal() ==  c1_mul_c2a.getReal());
	}
	
	@Test(timeout=5000)
	public void test3() {
		double r1 = 0.0;
		double i1 = 1.0; 
		double r2 = 0.0;
		double i2 = -1.0;
		Complex c1 = new Complex(r1, i1);
		Complex c2 = new Complex(r2, i2);
		Complex c1_add_c2 = c1.add(c2);
		Complex c1_sub_c2 = c1.sub(c2);
		Complex c1_mul_c2 = c1.mul(c2);
		
		ComplexAnswer c1a = new ComplexAnswer(r1, i1);
		ComplexAnswer c2a = new ComplexAnswer(r2, i2);
		ComplexAnswer c1_add_c2a = c1a.add(c2a);
		ComplexAnswer c1_sub_c2a = c1a.sub(c2a);
		ComplexAnswer c1_mul_c2a = c1a.mul(c2a);
		
		assertTrue(c1_add_c2.getReal() ==  c1_add_c2a.getReal());
		assertTrue(c1_sub_c2.getReal() ==  c1_sub_c2a.getReal());
		assertTrue(c1_mul_c2.getReal() ==  c1_mul_c2a.getReal());
	}
	
	@Test(timeout=5000)
	public void test4() {
		double r1 = 0.0;
		double i1 = 0.0; 
		double r2 = 3.0;
		double i2 = -20.0;
		Complex c1 = new Complex(r1, i1);
		Complex c2 = new Complex(r2, i2);
		Complex c1_add_c2 = c1.add(c2);
		Complex c1_sub_c2 = c1.sub(c2);
		Complex c1_mul_c2 = c1.mul(c2);
		
		ComplexAnswer c1a = new ComplexAnswer(r1, i1);
		ComplexAnswer c2a = new ComplexAnswer(r2, i2);
		ComplexAnswer c1_add_c2a = c1a.add(c2a);
		ComplexAnswer c1_sub_c2a = c1a.sub(c2a);
		ComplexAnswer c1_mul_c2a = c1a.mul(c2a);
		
		assertTrue(c1_add_c2.getReal() ==  c1_add_c2a.getReal());
		assertTrue(c1_sub_c2.getReal() ==  c1_sub_c2a.getReal());
		assertTrue(c1_mul_c2.getReal() ==  c1_mul_c2a.getReal());
	}
	
	@Test(timeout=5000)
	public void test5() {
		double r1 = 20.0;
		double i1 = 10.0; 
		double r2 = 0.0;
		double i2 = 0.0;
		Complex c1 = new Complex(r1, i1);
		Complex c2 = new Complex(r2, i2);
		Complex c1_add_c2 = c1.add(c2);
		Complex c1_sub_c2 = c1.sub(c2);
		Complex c1_mul_c2 = c1.mul(c2);
		
		ComplexAnswer c1a = new ComplexAnswer(r1, i1);
		ComplexAnswer c2a = new ComplexAnswer(r2, i2);
		ComplexAnswer c1_add_c2a = c1a.add(c2a);
		ComplexAnswer c1_sub_c2a = c1a.sub(c2a);
		ComplexAnswer c1_mul_c2a = c1a.mul(c2a);
		
		assertTrue(c1_add_c2.getReal() ==  c1_add_c2a.getReal());
		assertTrue(c1_sub_c2.getReal() ==  c1_sub_c2a.getReal());
		assertTrue(c1_mul_c2.getReal() ==  c1_mul_c2a.getReal());
	}

}
