package com.technoelevate.ifelse;

public class LowerUpperDigitSpecialchar {

	public static void main(String[] args) {
		char ch = '*';
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + "is an upper case alphabet");

		} else if (ch >= 'a' && ch <= 'z') {

			System.out.println(ch + "is an lower case alphabet");

		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + "is a digit");

		} else
			System.out.println(ch + "is a special character");
	}

}
