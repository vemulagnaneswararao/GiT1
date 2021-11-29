package com.technoelevate.ifelse;

public class LargestOf4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 40;
		int d = 1;

		if (a > b && a > c && a > d) {
			System.out.println(a + "is largest");
		} else if (b > c && b > d) {
			System.out.println(b + "is largest");
		} else if (c > d) {
			System.out.println(c + "is largest");
		} else {
			System.out.println(d + "is largest");
		}
	}

}
