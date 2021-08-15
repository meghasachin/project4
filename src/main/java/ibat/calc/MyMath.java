package ibat.calc;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyMath {
	
	public int MyAdd(int a, int b) {
		return a + b;
	}
	
	public int MySubtract(int a, int b) {
		return a - b;
	}
	
	public int MyMultiply(int a, int b) {
		return a * b;
	}
	
	// Used MathContext based on suggestion on 
	// https://stackoverflow.com/questions/4591206/arithmeticexception-non-terminating-decimal-expansion-no-exact-representable
	public float MyDivide(BigDecimal a, BigDecimal b) {
		return a.divide(b, 2, RoundingMode.HALF_UP).floatValue();
	}
}
