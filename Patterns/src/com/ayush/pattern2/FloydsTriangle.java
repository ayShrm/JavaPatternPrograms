package com.ayush.pattern2;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();

		int count = 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count+"   ");
				count++;
			}
			System.out.println();
		}

		sc.close();
	}

}
