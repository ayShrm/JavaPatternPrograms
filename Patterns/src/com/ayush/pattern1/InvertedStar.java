package com.ayush.pattern1;

import java.util.Scanner;

public class InvertedStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Rows: ");
		int row = sc.nextInt();
//		System.out.println("Cols: ");
//		int col = sc.nextInt();
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		sc.close();
	}

}
