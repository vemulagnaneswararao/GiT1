package com.technoelevate.forloop;

public class AlphByPos {

	public static void main(String[] args) {
		int pos = 4;
		int count = 0;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			count++;
			if (pos == count) {
				System.out.println(ch);
				break;

			}
		}

	}

}
