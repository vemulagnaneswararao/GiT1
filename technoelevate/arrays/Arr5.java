package com.technoelevate.arrays;

import java.util.Scanner;

public class Arr5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter the values : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int first = arr[0];
		int second = 0;
		for (int i = 0; i < arr.length; i++) {
			if (first < arr[i]) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second && first != arr[i]) {
				second = arr[i];
			}
		}
		System.out.println("Second largest element of an array is : " + second);
	}

}
