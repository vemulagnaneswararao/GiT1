package com.technoelevate.standard;

public class QuotientWithoutOper {

	public static void main(String[] args) {
		int divident = 9;
		int divisor = 3;
		int count = 0;
		int temp = divident;
		while (divident >= divisor) {
			count++;
			divident = divident - divisor;
		}

		System.out.println(" The quotient of " + temp + " divisible by " + divisor + " is : " + count);

	}

}
