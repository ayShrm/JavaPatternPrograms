package com.ayush.basics;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n, sum =0;
		int index = 1;
		
		System.out.println("***Sum of first N natural numbers***");
		System.out.println("Enter the value of N: ");
		n = sc.nextInt();
		while (index <= n) {
			sum = sum + index;
			index++;
		}		
		System.out.println("Sum of first N natural numbers: "+sum);
		
		sc.close();
	}

}
