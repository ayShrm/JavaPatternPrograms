package com.ayush.pattern2;

import java.util.Scanner;

public class ReverseNumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			for(int j=2; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
