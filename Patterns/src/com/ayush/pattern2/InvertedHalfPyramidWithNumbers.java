package com.ayush.pattern2;

import java.util.Scanner;

public class InvertedHalfPyramidWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}
}
