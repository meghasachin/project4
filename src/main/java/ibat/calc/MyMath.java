package ibat.calc;

import java.math.BigDecimal;

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
	
	public float divide(BigDecimal a, BigDecimal b) {
		return a.divide(b).floatValue();
	}
}
