package com.bridgelabz;

import java.util.Scanner;
public class CoreProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number First:");
		int a = sc.nextInt();
		System.out.println("Enter number Second:");
		int b = sc.nextInt();
		int quotient = a/b;
		int remainder = a%b;
		System.out.println("The Quotient is:"+quotient);
		System.out.println("The Remainder is:"+remainder);
	}
}
