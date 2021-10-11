package tests.com.pelatro.uts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import com.pelatro.uts.Calculator;

public class AdderTesting {
	private Calculator cal = new Calculator();
	@Test
	public void testAddPositiveCase() {
		assertEquals(7, cal.add(3, 4));
	}
	@Test
	public void testAddNegativeCase() {
		assertEquals(-2, cal.add(0, -2));
	}
	@Test
	public void testAddBoundryCase() {
		Long add = cal.add(Integer.MAX_VALUE, 1);
		assertNotNull(add);
		assertEquals(add,new Long(Integer.MAX_VALUE+1));
	}
	@Test(expected = RuntimeException.class)
	public void testNullRuntimeException() {
		assertNull(cal.add(null, null));
	}
}
