package com.technoelevate.standard;

public class Pallindrome {

	public static void main(String[] args) {
		int n = 121;
		int rev = 0;
		int temp = n;

		while (n > 0) {
			rev = (rev * 10) + (n % 10);
			n = n / 10;
		}
		if (rev == temp) {
			System.out.println(temp + " is pallindrome ");

		} else {
			System.out.println(temp + " is not a pallindrome");
		}

	}

}
