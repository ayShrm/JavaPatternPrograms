package com.ayush.basics;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int row, column;
		System.out.println("***Print the Square Pattern***");
		System.out.println("Enter the number of rows: ");
		row = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		column = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= column; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		sc.close();
	}

}
