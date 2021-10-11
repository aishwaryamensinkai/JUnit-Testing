package com.pelatro.uts;

import java.util.Date;

public class DateUtil {
	public Date getToday() {
		return new Date();
	}
	public Date addNDaysToToday(Integer n) {
		if( n == null)
			return null;
		Date today = getToday();
		return new Date(today.getTime() + n * 60 * 60 * 1000);
	}
	public Date subNDaysToToday(Integer n) {
		if( n == null)
			return null;
		Date today = getToday();
		return new Date(today.getTime() - n * 60 * 60 * 1000);
	}
}
