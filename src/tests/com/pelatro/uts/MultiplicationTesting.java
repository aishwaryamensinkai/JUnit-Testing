package tests.com.pelatro.uts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import com.pelatro.uts.Calculator;

public class MultiplicationTesting {
	private Calculator cal = new Calculator();
	@Test
	public void testMultiplicationPositiveCase() {
		assertEquals(100, cal.multiply(10, 10));
	}
	@Test
	public void testMultiplicationNegativeCase() {
		assertEquals(-100, cal.multiply(10, -10));
	}
	@Test
	public void testMultiplicationBoundryCase() {
		Long mul = cal.multiply(Integer.MAX_VALUE, -1);
		assertNotNull(mul);
		assertEquals(mul,new Long(Integer.MAX_VALUE * -1));
	}
	@Test(expected = RuntimeException.class)
	public void testNullRuntimeException() {
		assertNull(cal.sub(null, null));
	}
}
