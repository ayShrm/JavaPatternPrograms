package com.ayush.pattern2;

import java.util.Scanner;

public class RightPascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();

		// FirstHalf
		for (int i = 1; i <= row; i++) {

			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = row-1; i >= 1; i--) {

			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}
