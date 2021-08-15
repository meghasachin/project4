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

	/*********************************************************************************************************/
	/*                                 			Addition													 */
	/*********************************************************************************************************/
	// testing addition of whole even numbers
	@Test
	public void testAdd_TC1() {
		int a = 10;
		int b = 20;
		int result = testObject.MyAdd(a, b);
		assertEquals("Addition of 10 and 20 is.", 30, result, 0.0);
	}
		
	// testing addition of odd numbers
	@Test
	public void testAdd_TC2() {
		int a = 5;
		int b = 7;
		int result = testObject.MyAdd(a, b);
		assertEquals("Addition of 5 and 7 is.", 12, result, 0.0);	
	}
	
	// testing addition of zero 
	@Test
	public void testAdd_TC3() {
		int a = 0;
		int b = 0;
		int result = testObject.MyAdd(a, b);
		assertEquals("Addition of 0 and 0 is.", 0, result, 0.0);
	}
	
	// testing addition of positive and negative numbers
	@Test
	public void testAdd_TC4() {
		int a = -5;
		int b = 7;
		int result = testObject.MyAdd(a, b);
		assertEquals("Addition of -5 and 7 is.", 2, result, 0.0);		
	}
	
	// testing addition of both negative numbers
	@Test
	public void testAdd_TC5() {
		int a = -5;
		int b = -7;
		int result = testObject.MyAdd(a, b);
		assertEquals("Addition of -5 and -7 is.", -12, result, 0.0);		
	}	

	/*********************************************************************************************************/
	/*                                 			Subtraction													 */
	/*********************************************************************************************************/

	// test subtraction of positive even whole numbers
	@Test
	public void testSubtract_TC1() {
		int a = 20;
		int b = 10;
		int result = testObject.MySubtract(a, b);
		assertEquals("Substraction of 20 and 10 is.", 10, result, 0.0);		
	}
	
	// test subtraction of positive odd numbers
	@Test
	public void testSubtract_TC2() {
		int a = 7;
		int b = 5;
		int result = testObject.MySubtract(a, b);
		assertEquals("Substraction of 7 and 5 is.", 2, result, 0.0);
	}
	
	// test subtraction of positive and negative numbers
	@Test
	public void testSubtract_TC3() {
		int a = 7;
		int b = -5;
		int result = testObject.MySubtract(a, b);
		assertEquals("Substraction of 7 and -5 is.", 12, result, 0.0);		
	}
	
	// test subtraction of both negative decimal numbers
	@Test
	public void testSubtract_TC4() {
		int a = -7;
		int b = -5;
		int result = testObject.MySubtract(a, b);
		assertEquals("Substraction of -7 and -5 is.", -2, result, 0.0);		
	}
	
	// test subtraction of zeros
	@Test
	public void testSubtract_TC5() {
		int a = 0;
		int b = 0;
		int result = testObject.MySubtract(a, b);
		assertEquals("Substraction of 0 and 0 is.", 0, result, 0.0);		
	}	
	
	/*********************************************************************************************************/
	/*                                 			Multiplication												 */
	/*********************************************************************************************************/

	// test multiplication of positive even whole numbers
	@Test
	public void testMultiply_TC1() {
		int a = 10;
		int b = 20;
		int result = testObject.MyMultiply(a, b);
		assertEquals("Multiplication of 10 and 20 is.", 200, result, 0);		
	}
	
	// test multiplication of positive odd numbers
	@Test
	public void testMultiply_TC2() {
		int a = 7;
		int b = 5;
		int result = testObject.MyMultiply(a, b);
		assertEquals("Multiplication of 7 and 5 is.", 35, result, 0.0);		
	}
	
	// test multiplication of positive and negative decimal numbers
	@Test
	public void testMultiply_TC3() {
		int a = 7;
		int b = -5;
		int result = testObject.MyMultiply(a, b);
		assertEquals("Multiplication of 7 and -5 is.", -35, result, 0.0);		
	}
	
	// test multiplication of both negative decimal numbers
	@Test
	public void testMultiply_TC4() {
		int a = -7;
		int b = -5;
		int result = testObject.MyMultiply(a, b);
		assertEquals("Multiplication of -7 and -5 is.", 35, result, 0.0);
	}
	
	// test multiplication of zeros
	@Test
	public void testMultiply_TC5() {
		int a = 0;
		int b = 0;
		int result = testObject.MyMultiply(a, b);
		assertEquals("Multiplication of 0 and 0 is.", 0, result, 0.0);
	}	
	
	
	/*********************************************************************************************************/
	/*                                 			Division													 */
	/*********************************************************************************************************/

	// test division of positive even whole numbers
	@Test
	public void testDivide_TC1() {
		int a = 20;
		int b = 10;
		int result = testObject.MyDivide(a, b);
		assertEquals("Division of 20 and 10 is.", 2, result, 0.0);
	}
	
	// test division of positive odd whole numbers
	@Test
	public void testDivide_TC2() {
		int a = 25;
		int b = 5;
		int result = testObject.MyDivide(a, b);
		assertEquals("Division of 25 and 5 is.", 5, result, 0.0);
	}
	
	// test division of positive and negative decimal numbers
	@Test
	public void testDivide_TC3() {
		int a = 25;
		int b = -5;
		int result = testObject.MyDivide(a, b);
		assertEquals("Division of 25 and -5 is.", -5, result, 0.0);
	}
	
	// test division of both negative decimal numbers
	@Test
	public void testDivide_TC4() {
		int a = -25;
		int b = -5;		
		int result = testObject.MyDivide(a, b);
		assertEquals("Division of -25 and -5 is.", 5, result, 0.0);
	}
	
	// test division of zeros; should throw arithmetic exception 
	@Test (expected = ArithmeticException.class)
	public void testDivide_TC5() {
		int a = 0;
		int b = 0;
		int result = testObject.MyDivide(a, b);
	}
}
