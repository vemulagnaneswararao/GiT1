package com.technoelevate.arrays;

import java.util.Scanner;

public class Arr1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

		// Array creation
		int arr[] = new int[size];
		System.out.println("Enter the values :");
		for (int i = 0; i <= arr.length / 2; i++) {
			arr[i] = sc.nextInt();
		}

		// Printing
		System.out.println("values are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
