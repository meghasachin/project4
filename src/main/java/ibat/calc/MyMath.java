package ibat.calc;

import java.math.BigDecimal;

public class MyMath {
	
	public float testAdd(BigDecimal a, BigDecimal b) {
		return a.add(b).floatValue();
	}
	
	public float testSubtract(BigDecimal a, BigDecimal b) {
		return a.subtract(b).floatValue();
	}
	
	public float testMultiply(BigDecimal a, BigDecimal b) {
		return a.multiply(b).floatValue();
	}
	
	public float testDivide(BigDecimal a, BigDecimal b) {
		return a.divide(b).floatValue();
	}
}
