package ibat.calc;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
	
	private MyMath testObject;
	
	@Before
	public void initialize() {
		testObject = new MyMath();
	}
	
	// testing addition of whole numbers
	@Test
	public void testAdd_TC1() {
		BigDecimal a = new BigDecimal(10);
		BigDecimal b = new BigDecimal(20);
		float result = testObject.add(a, b);
		assertEquals("Addition of 10 and 20 is.", 30, result, 0.0);
	}
	
	
	// testing addition of decimal numbers
	@Test
	public void testAdd_TC2() {
		BigDecimal a = new BigDecimal(5.5);
		BigDecimal b = new BigDecimal(5.2);
		float result = testObject.add(a, b);
		assertEquals("Addition of 5.5 and 5.2 is.", new BigDecimal(10.7).floatValue(), result, 0.0);
	}
	
	// testing addition of zero 
	@Test
	public void testAdd_TC3() {
		BigDecimal a = new BigDecimal(0);
		BigDecimal b = new BigDecimal(0);
		float result = testObject.add(a, b);
		assertEquals("Addition of 0 and 0 is.", new BigDecimal(0).floatValue(), result, 0.0);
	}
	
	// testing addition of positive and negative numbers
	@Test
	public void testAdd_TC4() {
		BigDecimal a = new BigDecimal(-5);
		BigDecimal b = new BigDecimal(7);
		float result = testObject.add(a, b);
		assertEquals("Addition of -5 and 7 is.", new BigDecimal(2).floatValue(), result, 0.0);
	}
	
	// testing addition of both negative numbers
	@Test
	public void testAdd_TC5() {
		BigDecimal a = new BigDecimal(-5);
		BigDecimal b = new BigDecimal(-7);
		float result = testObject.add(a, b);
		assertEquals("Addition of -5 and -7 is.", new BigDecimal(-12).floatValue(), result, 0.0);
	}	

	// test subtraction of positive whole numbers
//	@Test
//	public void testSubtract_TC1() {
//		int a = 20;
//		int b = 10;
//		float result = testObject.testSubtract(a, b);
//		assertEquals("Substraction of 20 and 10 is.", 10, result, 0);
//	}
//	
//	@Test
//	public void testSubtract_TC2() {
//		double a = 5.5;
//		double b = 4.4;
//		double result = testObject.testSubtract(a, b);
//		assertEquals("Substraction of 5.5 and 4.4 is.", 1.1, result, 0.1);
//	}
//	
//	@Test
//	public void testSubtract_TC3() {
//		double a = 5.5;
//		double b = -4.4;
//		double result = testObject.testSubtract(a, b);
//		assertEquals("Substraction of 5.5 and -4.4 is.", 10, result, 0.1);
//	}
//	
//	@Test
//	public void testSubtract_TC4() {
//		double a = -5.5;
//		double b = -4.4;
//		double result = testObject.testSubtract(a, b);
//		assertEquals("Substraction of -5.5 and -4.4 is.", 1.1, result, -0.1);
//	}
//	
//	@Test
//	public void testSubtract_TC5() {
//		double a = 0;
//		double b = 0;
//		double result = testObject.testSubtract(a, b);
//		assertEquals("Substraction of 0 and 0 is.", 0, result, 0);
//	}	
//	
//	@Test
//	public void testMultiply() {
//		int a = 10;
//		int b = 20;
//		double result = testObject.testMultiply(a, b);
//		assertEquals("Multiplication of 10 and 20 is.", 200, result, 0);
//	}
//	
//	@Test
//	public void testDivide() {
//		int a = 20;
//		int b = 10;
//		double result = testObject.testDivide(a, b);
//		assertEquals("Multiplication of 20 and 10 is.", 2, result, 0);
//	}
}
