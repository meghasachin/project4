package ibat.calc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	
	private MyMath testObject;
	
	@Before
	public void initialize() {
		testObject = new MyMath();
	}
	
	@Test
	public void testAdd_TC1() {
		double a = 10;
		double b = 20;
		double result = testObject.testAdd(a, b);
		assertEquals("Addition of 10 and 20 is.", 30, result, 0);
	}
	
	@Test
	public void testAdd_TC2() {
		double a = 5.5;
		double b = 5.2;
		double result = testObject.testAdd(a, b);
		assertEquals("Addition of 5.5 and 5.2 is.", 10.7, result, 0);
	}
	
	@Test
	public void testAdd_TC3() {
		double a = 0;
		double b = 0;
		double result = testObject.testAdd(a, b);
		assertEquals("Addition of 0 and 0 is.", 0, result, 0);
	}	
	
	@Test
	public void testAdd_TC4() {
		double a = -5;
		double b = 7;
		double result = testObject.testAdd(a, b);
		assertEquals("Addition of -5 and 7 is.", 2, result, 0);
	}
	
	@Test
	public void testAdd_TC5() {
		double a = -5;
		double b = -7;
		double result = testObject.testAdd(a, b);
		assertEquals("Addition of -5 and -7 is.", -12, result, 0);
	}	
	
	@Test
	public void testSubtract_TC1() {
		int a = 20;
		int b = 10;
		double result = testObject.testSubtract(a, b);
		assertEquals("Substraction of 20 and 10 is.", 10, result, 0);
	}
	
	@Test
	public void testSubtract_TC2() {
		double a = 5.5;
		double b = 4.4;
		double result = testObject.testSubtract(a, b);
		assertEquals("Substraction of 5.5 and 4.4 is.", 1.1, result, 0.1);
	}
	
	@Test
	public void testSubtract_TC3() {
		double a = 5.5;
		double b = -4.4;
		double result = testObject.testSubtract(a, b);
		assertEquals("Substraction of 5.5 and -4.4 is.", 10, result, 0.1);
	}
	
	@Test
	public void testSubtract_TC4() {
		double a = -5.5;
		double b = -4.4;
		double result = testObject.testSubtract(a, b);
		assertEquals("Substraction of -5.5 and -4.4 is.", 1.1, result, -0.1);
	}
	
	@Test
	public void testSubtract_TC5() {
		double a = 0;
		double b = 0;
		double result = testObject.testSubtract(a, b);
		assertEquals("Substraction of 0 and 0 is.", 0, result, 0);
	}	
	
	@Test
	public void testMultiply() {
		int a = 10;
		int b = 20;
		double result = testObject.testMultiply(a, b);
		assertEquals("Multiplication of 10 and 20 is.", 200, result, 0);
	}
	
	@Test
	public void testDivide() {
		int a = 20;
		int b = 10;
		double result = testObject.testDivide(a, b);
		assertEquals("Multiplication of 20 and 10 is.", 2, result, 0);
	}
}
