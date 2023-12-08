package com.ayush.basics;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int number) {
		
		int index =1, fact =1;
		
		fact = fact * number;
		while(index<number) {
			fact = fact * (number-index);
			index++;
		}
		
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.println(factorial(number));
		
		sc.close();
	}

}
