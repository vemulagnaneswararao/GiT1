package com.technoelevate.standard;

public class PowerValue {

	public static void main(String[] args) {
		int x = 2;
		int n = 3;
		int product = 1;
		for (int i = 1; i <= n; i++) {
			product = product * x;
		}

		System.out.println("The value of " + x + " power " + n + " is : " + product);
	}

}
