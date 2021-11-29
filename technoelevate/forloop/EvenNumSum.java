package com.technoelevate.forloop;

public class EvenNumSum {

	public static void main(String[] args) {
		int m = 20;
		int n = 30;
		int sum = 0;

		for (int i = m; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("sum is : " + sum);

	}

}
