package com.ict100.jutiprojects;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void calTestAddFail() {
assertEquals("error in add()",21, Calculator.add(10, 11));
assertEquals("error in add()", -11, Calculator.add(-6, -5));
assertEquals("error in add()", 27, Calculator.add(9,18));
	}
	
	public void calcTestFail() {
	 assertEquals("error in add() ",0, Calculator.add(1,2));	
}


public void calcTestSubPass() {
	assertEquals("error in sub()", 27, Calculator.add(20, 7));
	assertEquals("error in sub()", -1, Calculator.add(-1, -2));
	assertEquals("error in sub()", 0, Calculator.add(9, 0));
			
}
public void calcSubFail() {
	 assertEquals("error in add() ",0, Calculator.add(2, 1));	
}
}