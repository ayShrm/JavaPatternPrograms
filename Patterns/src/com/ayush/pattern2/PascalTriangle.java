package com.ayush.pattern2;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();

		// FirstHalf
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num = num * (i - j) / (j);
			}

			System.out.println();
		}

		sc.close();
	}

}
