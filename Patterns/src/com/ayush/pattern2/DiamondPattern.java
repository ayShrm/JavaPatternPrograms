package com.ayush.pattern2;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (2*i)-1; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= row - i; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}
		for (int i = row; i >=1; i--) {

			for (int j = 1; j <= 2 * (row - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= ((2 * i) - 1); j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		sc.close();
	}

}
