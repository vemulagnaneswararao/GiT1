package com.technoelevate.patterns;

public class Ptr7 {

	public static void main(String[] args) {
		int n = 4;
		int k = 1;
		char ch = 'a';
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					System.out.print(k++ + " ");
				} else {
					System.out.print(ch++ + " ");
				}
			}
			System.out.println();

		}

	}
}