package com.ayush.pattern2;

import java.util.Scanner;

public class HollowRectPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();

		System.out.println("Enter the number of cols: ");
		int col = sc.nextInt();

		// rows = 4
		// cols = 5
		System.out.println("=====HOllow Rectangle======");
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {
				if (i == 1 || i == row || j == 1 || j == col) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
