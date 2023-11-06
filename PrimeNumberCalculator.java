package com.study;

import java.util.Scanner;

public class PrimeNumberCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number upto prime number print : ");
		int input = sc.nextInt();
		int count = 0;
		for (int num = 2; num < input; num++) {
			boolean isPrime = true;
			for (int divisor = 2; divisor < num; divisor++) {
				if (num % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(num + " ");
				count++;        
			}
		}
		System.out.println("\nTotal Prime number upto the input number : " + count);
		sc.close();
	}

}
