package tests.com.pelatro.uts.suite;

import tests.com.pelatro.uts.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	AdderTesting.class,
	SubstractTesting.class,
	MultiplicationTesting.class,
	DivisionTesting.class,
	DateUtilTesting.class,
	PhoneBookTesting.class,
})
public class TestSuit {
}
