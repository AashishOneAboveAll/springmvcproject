package com.bway.springproject;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.test.Calculation;

public class CalculationTest {
	static Calculation test=null;
	@BeforeClass
	public static void init() {
		System.out.println("Inside init method");
		test=new Calculation();
	}
	@Test
	public void testSquare() {

		int res = test.square(5);
		assertEquals(res, 25);
	}

	@Test
	public void testSI() {

		int res = test.SI(1000, 1, 1);
		assertEquals(res, 1000);

	}
}
