/**
 * 
 */
package com.ayush.basics;

import java.util.Scanner;

public class SumOfEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int number = sc.nextInt();

		int even_sum = 0, odd_sum = 0, lastdigit;

		while (number > 0) {
			lastdigit = number % 10;
			if (lastdigit % 2 == 0) {

				even_sum = even_sum + lastdigit;
			} else {
				odd_sum = odd_sum + lastdigit;
			}
			number = number / 10;
		}

		System.out.println("Sum of even numbers: " + even_sum);
		System.out.println("Sum of odd numbers: " + odd_sum);
		sc.close();
	}

}
