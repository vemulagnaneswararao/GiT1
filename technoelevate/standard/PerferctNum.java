package com.technoelevate.standard;

public class PerferctNum {

	public static void main(String[] args) {
		int n = 28;
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println(n + " is a perfect number ");

		} else {
			System.out.println(n + " is not perfect number ");

		}
	}

}
