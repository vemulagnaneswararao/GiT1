package com.technoelevate.patterns;

public class Ptr13 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			int k = n;
			char ch = 'a';
			for (int j = 0; j < n; j++) {
				if (i + j <= n - 1) {
					if (i % 2 == 0) {
						System.out.print(k-- + " ");
					} else
						System.out.print(ch++ + " ");
				}
			}
			System.out.println();
		}
	}

}
