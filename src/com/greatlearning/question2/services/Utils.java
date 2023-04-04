package com.greatlearning.question2.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {
	private static final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static int amountPayable() throws NumberFormatException, IOException {
		System.out.println("Enter amount that you want to pay");
		
		int amount=0;
		amount = Integer.parseInt(br.readLine());		
		return amount;
	}

	public static int[] inputDenominations() throws NumberFormatException, IOException {
		System.out.println("Enter the size of currency denominations");
		int size = Integer.parseInt(br.readLine());
		
		int[] denominations=new int[size];
		System.out.println("Enter the denominations value");
		for (int i = 0; i < size; i++) {
			denominations[i]=Integer.parseInt(br.readLine());
		}
		
		bubbleSort(denominations);
		return denominations;

	}

	public static void frequency(int[] denominations, int amount) {

		System.out.println("Your payment approach in order to give them minimum number of notes will be");

		int a = amount;

		for (int i : denominations) {
			int d = a / i;
			a -=d*i;
			if(d!=0)
				System.out.println(i + " : " + d);
			
		}

	}
	
	public static void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
