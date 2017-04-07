package io.github.joaomlneto.travis_ci_tutorial_java;

public class Driver {

	public static final void main(String[] args) {
		SimpleCalculator calculator = new SimpleCalculator();
		int startingNumber = 10;
		int res;
		
		res = calculator.mul(startingNumber, 3);
		res = calculator.mul(res, 7);
		res = calculator.mul(res, 13);
		res = calculator.mul(res, 37);
		
		System.out.println("Result is " + res);
		
	}
}
