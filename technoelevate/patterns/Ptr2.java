package com.technoelevate.patterns;

public class Ptr2 {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 && j == n - 1 || i == 1 && j == 1) {
					System.out.print("# ");

				} else if (i == 2 && j == 0) {
					System.out.print("% ");
				} else if (i == 2 && j == 2) {
					System.out.print("! ");
				} else if (i == 3 && j == 3) {
					System.out.print("* ");
				} else
					System.out.print("A ");
			}
			System.out.println("");

		}

	}
}