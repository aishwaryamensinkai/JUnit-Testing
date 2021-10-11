package tests.com.pelatro.uts;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import org.junit.Test;
import com.pelatro.uts.DateUtil;

public class DateUtilTesting {
	private DateUtil dateutil = new DateUtil();
	@Test
	public void getTodayCase() {
		assertEquals(new Date(),dateutil.getToday());
	}
	@Test
	public void addNDaysToTodayCase() {
		assertEquals(new Date(new Date().getTime() + 5 * 60 * 60 * 1000),dateutil.addNDaysToToday(5));
	}
	@Test
	public void subNDaysToTodayCase() {
		assertEquals(new Date(new Date().getTime() - 5 * 60 * 60 * 1000),dateutil.subNDaysToToday(5));
	}
	@Test
	public void testNullRuntimeException() {
		assertNull(dateutil.addNDaysToToday(null));
		assertNull(dateutil.subNDaysToToday(null));
	}
}
