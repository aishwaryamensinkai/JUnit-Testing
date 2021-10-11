package com.pelatro.uts;

public class Calculator {
	public long add(Integer x,Integer y) {
		if(x == null || y == null)
			throw new RuntimeException();
		return x+y;
	}
	public long sub(Integer x,Integer y) {
		if(x == null || y == null)
			throw new RuntimeException();
		return x-y;
	}
	public long multiply(Integer x,Integer y) {
		if(x == null || y == null)
			throw new RuntimeException();
		return x*y;
	}
	public long division(Integer x,Integer y) {
		if(x == null || y == null)
			throw new RuntimeException();
		return x/y;
	}
}
