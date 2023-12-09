package com.ayush.pattern2;

import java.util.Scanner;

public class HollowTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();

//		System.out.println("Enter the number of cols: ");
//		int col = sc.nextInt();

// if number of rows and column are known
//		for(int i = 1; i<=row; i++) {
//			for(int j = 1; j<=col; j++) {
//				if((i+j)==7 || (j-i) == 5 || i == row) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (i == row || j == 1 || j == 2 * i - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
