package org.ssglobal.training.codes.answers;

public class Fraction {

	public int numerator;
	public int denominator;

	public int getNumertor() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void toFractionString() {
		System.out.println(numerator + "/" + denominator);
	}
	
	public Fraction add(Fraction summand) {
		numerator = numerator + summand.numerator;
		denominator = denominator + summand.denominator;
		
		Fraction f = new Fraction();
		f.numerator = numerator;
		f.denominator = denominator;
		return f;
	}
}
