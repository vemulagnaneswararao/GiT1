package com.technoelevate.collection.casestudy1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	static ArrayList arrayList = new ArrayList();
	static Scanner scanner = new Scanner(System.in);

	public static void getList() {

		String a[] = { "tomato", "milk", "soap", "flour" };
		for (int i = 0; i <= a.length - 1; i++) {
			System.out.println(i + 1 + " " + a[i]);
		}

	}

	public static void viewList() {

		for (int i = 0; i < arrayList.size(); i++) {

			System.out.println(arrayList.get(i));

		}

	}

	public static void addList() {
		System.out.println("how many items you want");
		int b = scanner.nextInt();
		for (int i = 0; i < b; i++) {
			System.out.println("enter item num you want to add");
			int a3 = scanner.nextInt();
			arrayList.add(null);

		}

	}

	public static void init(int n) {
		if (n == 0) {

			getList();

		}
		int z = scanner.nextInt();
		if (z == 1) {

			addList();

		}
		int q = scanner.nextInt();
		if (q == 2) {
			System.out.println("viewing list");

			viewList();

		}
	}

	public static void main(String[] args) {
		System.out.println("welcome to swiggy mart");
		System.out.println("press 0 to know all available items");
		System.out.println("press 1 to add items to cart");
		System.out.println("press 2 to view items to cart");

		int num = scanner.nextInt();
		init(num);

	}
}
