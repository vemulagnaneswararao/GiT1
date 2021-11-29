package com.technoelevate.arrays;

import java.util.Scanner;

public class Arr3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

		// Array Creation
		int arr[] = new int[size];
		System.out.println("enter the value : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// Printing
		int largest = arr[0];
		System.out.println("values are.. ");
		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println("The largest element of an array is : " + largest);

	}

}
