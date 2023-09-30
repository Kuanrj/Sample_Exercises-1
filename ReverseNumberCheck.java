package com.sample1;

import java.util.Scanner;

public class ReverseNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");

		int num = sc.nextInt();
// Function to check if a number is equal to its reverse 
		int reverseNum = 0;
		while (num != 0) {
			int lastdigit = num % 10; // Getting Remainder
			reverseNum = reverseNum * 10 + lastdigit; 
			num = num / 10;

		}
		System.out.print("Reverse no :" + reverseNum + ", ");

		if (num == reverseNum)
			System.out.println("A pallindrome");
		else
			System.out.println("Not a pallindrome");
	}

}
