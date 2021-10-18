package com.bridgelabz;

import java.util.Scanner;
public class CoreProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of x and y:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("Before Swapping numbers:"+x+" "+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("Before Swapping numbers:"+x+" "+y);
	}
}
