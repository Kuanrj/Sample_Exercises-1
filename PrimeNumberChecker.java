package com.study;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();

		if (number <= 1) {
			System.out.println(number + " is not a prime number");
		} else if (number == 2) {
			System.out.println(number + " is a prime number");
		} else {
			int i;
			for (i = 2; i < number; i++) {
				if (number % i == 0) {
					break;
				}
			}

			if (i == number) {
				System.out.println(number + " is a prime number");
			} else {
				System.out.println(number + " is not a prime number");
			}
		}
		sc.close();
	}
}
