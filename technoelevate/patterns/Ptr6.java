package com.technoelevate.patterns;

public class Ptr6 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			int k = 5;
			for (int j = 0; j < n; j++) {
				System.out.print(k-- + " ");
			}
			System.out.println();

		}

	}
}
