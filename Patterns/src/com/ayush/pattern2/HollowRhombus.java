package com.ayush.pattern2;

import java.util.Scanner;

public class HollowRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print("  ");
			}

			for (int j = 1; j <= row; j++) {
				if (i == 1 || i == row || j == 1 || j == row) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}

		sc.close();
	}

}