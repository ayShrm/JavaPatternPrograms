package com.ayush.pattern2;

import java.util.Scanner;

public class IncreasingNumberReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();

		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	}

}
