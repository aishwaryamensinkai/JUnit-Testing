package tests.com.pelatro.uts;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import com.pelatro.uts.Calculator;

public class DivisionTesting {
	private Calculator cal = new Calculator();
	@Test
	public void testdivisionCase() {
		assertEquals(1, cal.division(10, 10));
	}
	@Test
	public void testDivBoundryCase() {
		Long div = cal.division(Integer.MAX_VALUE, 1);
		assertNotNull(div);
		assertEquals(div,new Long(Integer.MAX_VALUE));
	}
	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		cal.division(3, 0);
	}
	@Test(expected = RuntimeException.class)
	public void testNullRuntimeException() {
		assertNull(cal.division(null, null));
	}
}
