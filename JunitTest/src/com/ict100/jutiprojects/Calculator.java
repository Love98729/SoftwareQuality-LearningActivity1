package com.ict100.jutiprojects;

public class Calculator {
	
	public static int add( int number, int number2) {
		return number + number2;
		
	}
	
	public static int sub(int number1, int number2) {
		return number1 - number2;
	}
	
	public static int mul(int number1 , number2) {
		return number1 * number2;
	}	
	
	public static double div(double number1, double number2) {
		if(number2==0 ) {
			throw new IllegalArgumentException("Number can not be divide by 0 !");
		}
		return  number1 / number2;
	}
	

}
