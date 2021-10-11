package tests.com.pelatro.uts;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import com.pelatro.uts.Calculator;

public class SubstractTesting {
	private Calculator cal = new Calculator();
	@Test
	public void testSubPositiveCase() {
		assertEquals(7, cal.sub(11, 4));
	}
	@Test
	public void testSubNegativeCase() {
		assertEquals(2, cal.sub(4, 2));
	}
	@Test
	public void testSubBoundryCase() {
		Long sub = cal.sub(Integer.MAX_VALUE, 1);
		assertNotNull(sub);
		assertEquals(sub,new Long(Integer.MAX_VALUE - 1));
	}
	@Test(expected = RuntimeException.class)
	public void testNullRuntimeException() {
		assertNull(cal.sub(null, null));
	}
}
