package com.ayush.basics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int number, digit;
		int reversen = 0;
		System.out.println("Enter the number to be reversed: ");
		number = sc.nextInt();

		while (number > 0) {
			digit = number % 10;
			reversen = (reversen * 10) + digit;
			number = number / 10;
		}

		System.out.println("Reverse of the number: " + reversen);
		sc.close();
	}

}
