package com.bridgelabz;

import java.util.Scanner;
public class CoreProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int number = sc.nextInt();
		double result = 0.0;
		System.out.println("The Harmonic series Is:");
		for (int i = number; i>0; i--) {
			result = result + (double)1 /i;
			System.out.println(result + ", ");
		}
	}
}
