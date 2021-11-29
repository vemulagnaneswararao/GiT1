package com.technoelevate.forloop;

public class PosByAlph {

	public static void main(String[] args) {
		char c = 'e';
		int pos = 0;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			pos++;
			if (ch == c) {
				System.out.println(pos);
				break;

			}
		}

	}

}
