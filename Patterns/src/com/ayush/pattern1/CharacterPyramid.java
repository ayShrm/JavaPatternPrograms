package com.ayush.pattern1;

import java.util.Scanner;

public class CharacterPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Rows: ");
		int row = sc.nextInt();
//		System.out.println("Cols: ");
//		int col = sc.nextInt();
		char ch = 65;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(ch);
				ch++;
			}

			
			System.out.println();
		}

		sc.close();
	}

}
