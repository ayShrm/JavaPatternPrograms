package com.ayush.basics;

import java.util.Scanner;

public class BreakStatementQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("***keep entering the numbers till the user enters the multiple of 10***");

		int number;

		while (true) {
			System.out.println("Enter the number: ");
			number = sc.nextInt();
			if (number % 10 == 0) {
				break;
			}
		}
		sc.close();
	}

}
