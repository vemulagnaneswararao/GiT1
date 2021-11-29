package com.technoelevate.arrays;

import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int size = sc.nextInt();

		// Array Creation
		int arr[] = new int[size];
		System.out.println("Enter the values : ");
		for (int i = arr.length / 2; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// Printing
		System.out.println("Values are..");
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("The Summation of second half of an array is : " + sum);
	}

}
