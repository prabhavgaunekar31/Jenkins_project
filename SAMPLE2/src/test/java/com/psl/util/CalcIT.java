package com.psl.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcIT {

	@Test
	public void testAdd() {
		assertEquals(6,Calc.add(3, 3));
	}

}
