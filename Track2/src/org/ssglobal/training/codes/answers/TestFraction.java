package org.ssglobal.training.codes.answers;

public class TestFraction {

	public static void main(String[] args) {
		
		// add() method
		Fraction f1 = new Fraction();
		f1.numerator = 1;
		f1.denominator = 2;
		
		Fraction f2 = new Fraction();
		f2.numerator = 3;
		f2.denominator = 4;
		
		f1.add(f2).toFractionString();

	}

}
