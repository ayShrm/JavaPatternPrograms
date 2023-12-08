package com.ayush.sum;

import java.util.Scanner;

public class BinarySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare the binary variables to store the binary value
		long binary1, binary2;
		
		//create the array to store the sum of the binary values 
		int sum[] = new int[50];

		int i = 0, remainder = 0;

		//scanner object to take input from the user
		Scanner sc = new Scanner(System.in);
		
		//To take the binary values form the user
		System.out.println("Enter first Binary: ");
		binary1 = sc.nextLong();
		System.out.println("Enter Second Binary: ");
		binary2 = sc.nextLong();
		
		//Loop to add the binary digits until the binary value has no date in the variable
		while (binary1 != 0 || binary2 != 0) {
			//sum[i++] stores the sum of the digits and then increase the index value by one
			//we divide the sum by 2 (%2) to get the remainder as either 0 or 1 and then store in sum array
			sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
			//stores the remainder 
			remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
			//gives the last digit of the binary value
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;
		}

		//checks if any remainder is left after binary addtion and then it adds this carry to the sum at the current index and then increment the index by one
		if (remainder != 0) {
			sum[i++] = remainder;
		}
		
		//this is done to prepare for the printing of sum because the sum is stored in reverse order
		//so decrementing i allows the program to print from most significant digit of the sum
		--i;

		// Display the sum of the two binary numbers
		System.out.print("Sum of two binary numbers: ");
		while (i >= 0) {
			System.out.print(sum[i--]);
		}
		
		sc.close();
	}

}
