package com.greatlearning.question1.main;

import java.util.Scanner;


public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] transactions = new int[size];
		System.out.println("Enter the values of array");
		for(int i=0;i<size;i++) {
			transactions[i]=sc.nextInt();
		}
		System.out.println("Enter the total number of targerts that needs to be achieved");
		int num_of_targets = sc.nextInt();

		for (int i = 0; i < num_of_targets; i++) {
			System.out.println("Enter the value of target");
			int target_value = sc.nextInt();

			int num = 0;
			int sum = 0;

			for (int j = 0; j < size; j++) {
				num++;
				sum += transactions[j];
				if (sum > target_value)
					break;
			}
			if (sum > target_value)
				System.out.println("Target achieved after " + num + " transactions");
			else
				System.out.println("Given target not achieved");

		}

		sc.close();

	}

}
