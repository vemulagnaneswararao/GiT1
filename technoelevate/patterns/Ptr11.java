package com.technoelevate.patterns;

public class Ptr11 {

	public static void main(String[] args) {
		int n = 4;
		char ch = 'A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j >= n - 1) {
					System.out.print(ch++ + " ");
					ch++;
				} else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
