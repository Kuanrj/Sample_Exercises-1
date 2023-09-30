package com.sample1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fibonacci series
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of Fibonacci numbers to print: ");
		int n = sc.nextInt();
		
		if (n<=0) {
			System.out.println("Please enter a positive integer.");
		} else {
			System.out.println("Fibonacci sequence of " + n + " numbers: ");
		}

		int first = 0, second = 1;

		for (int i = 0; i < n; i++) {
			System.out.print(first + " ");

			int next = first + second;
			first = second;
			second = next;

		}
	}

}
