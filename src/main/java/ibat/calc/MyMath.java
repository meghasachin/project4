package ibat.calc;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MyMath {
	
	public float add(BigDecimal a, BigDecimal b) {
		return a.add(b).floatValue();
	}
	
	public float subtract(BigDecimal a, BigDecimal b) {
		return a.subtract(b).floatValue();
	}
	
	public float multiply(BigDecimal a, BigDecimal b) {
		return a.multiply(b).floatValue();
	}
	
	// Used MathContext based on suggestion on 
	// https://stackoverflow.com/questions/4591206/arithmeticexception-non-terminating-decimal-expansion-no-exact-representable
	public float divide(BigDecimal a, BigDecimal b) {
		return a.divide(b, 2, RoundingMode.HALF_UP).floatValue();
	}
}
