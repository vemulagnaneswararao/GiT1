package com.technoelevate.patterns;

public class Ptr9 {

	public static void main(String[] args) {
		int n = 5;
		int k = 1;
		char ch = 'A';
		for (int i = 0; i < n; i++) {
			char sp = '*';
			for (int j = 0; j < n; j++) {
				if (i == n / 2 || j == n / 2) {
					System.out.print(sp + " ");
				} else if (j == 0 || j == 4) {
					System.out.print(k++ + " ");
				} else {
					System.out.print(ch++ + " ");
				}
			}
			System.out.println();
		}
	}

}
