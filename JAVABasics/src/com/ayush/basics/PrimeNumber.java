package com.ayush.basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int number;
		int n = 2;
		boolean isPrime = true;
		System.out.println("Enter the number: ");
		number = sc.nextInt();

		while (n < number) {
			if (number % n == 0) {
				isPrime = false;
				System.out.println(number + " is not prime number.");
				break;
			}
			n++;
		}

		if (isPrime == true)
			System.out.println(number + " is prime number.");
		sc.close();

	}

}
