package com.technoelevate.patterns;

public class Ptr5 {

	public static void main(String[] args) {
		int n = 4;
		int k = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(k++ + " ");
				if (k > 9) {
					k = 1;
				}

			}
			System.out.println();
		}

	}

}
