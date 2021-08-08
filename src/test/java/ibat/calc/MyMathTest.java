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
		int a = 10;
		int b = 20;
		int result = testObject.testAdd(a, b);
		assertEquals("Addition of 10 and 20 is.", 30, result);
	}
	
	@Test
	public void testSubtract_TC1() {
		int a = 20;
		int b = 10;
		int result = testObject.testSubtract(a, b);
		assertEquals("Substraction of 20 and 10 is.", 10, result);
	}
	
	@Test
	public void testMultiply() {
		int a = 10;
		int b = 20;
		int result = testObject.testMultiply(a, b);
		assertEquals("Multiplication of 10 and 20 is.", 200, result);
	}
	
	@Test
	public void testDivide() {
		int a = 20;
		int b = 10;
		int result = testObject.testDivide(a, b);
		assertEquals("Multiplication of 20 and 10 is.", 2, result);
	}
}
