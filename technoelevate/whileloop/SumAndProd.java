package com.technoelevate.whileloop;

public class SumAndProd {

	public static void main(String[] args) {
		int m = 2;
		int n = 8;
		int sum = 0;
		int product = 1;
		while (m <= n) {
			sum = sum + m;
			product = product * m;
			m++;
		}
		System.out.println("summation is " + sum);
		System.out.println("product is " + product);

	}

}
