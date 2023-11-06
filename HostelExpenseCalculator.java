package com.sample1;

import java.util.Scanner;

public class HostelExpenseCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//Ramesh's, Mahesh's and Suresh's Expenses taking input from user
		System.out.print("Enter Ramesh's expenses: ");
		double rameshExpenses = sc.nextDouble();

		System.out.print("Enter Mahesh's expenses: ");
		double maheshExpenses = sc.nextDouble();

		System.out.print("Enter Suresh's expenses: ");
		double sureshExpenses = sc.nextDouble();
		
//Calculate their total and average share 
		double totalExpenses = rameshExpenses + maheshExpenses + sureshExpenses;
		System.out.println("Total expenses: " + totalExpenses);

		double averageShare = totalExpenses / 3;
		System.out.println("Average share: " + averageShare);
		
//Calculate how much they spends more or less from each other 
		double rameshDifference = rameshExpenses - averageShare;
		double maheshDifference = maheshExpenses - averageShare;
		double sureshDifference = sureshExpenses - averageShare;
	
		System.out.println("Ramesh spends " + (rameshDifference >= 0 ? "more" : "less") + " than their average share: "
				+ Math.abs(rameshDifference));
		System.out.println("Mahesh spends " + (maheshDifference >= 0 ? "more" : "less") + " than their average share: "
				+ Math.abs(maheshDifference));
		System.out.println("Suresh spends " + (sureshDifference >= 0 ? "more" : "less") + " than their average share: "
				+ Math.abs(sureshDifference));

		sc.close();
	}

}
