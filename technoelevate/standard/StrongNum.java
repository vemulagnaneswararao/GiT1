package com.technoelevate.standard;

public class StrongNum {

	public static void main(String[] args) {
		int n = 145;
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int factorial = 1;
			int rem = n % 10;
			for (int i = 1; i <= rem; i++) {
				factorial = factorial * i;
			}
			sum = sum + factorial;
			n = n / 10;
		}
		if (sum == temp) {

			System.out.println("The number " + temp + " is a strong number ");
		} else {
			System.out.println("The number " + temp + " is a weak number ");
		}

	}

}
