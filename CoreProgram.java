package com.bridgelabz;

import java.util.Scanner;
public class CoreProgram {
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		year = sc.nextInt();
		if((year % 400==0) || (year % 4 == 0) && (year % 100 !=0)){
			System.out.println("Year is Leap");
		}
		else {
			System.out.println("Year is not Leap");
		}
	}
}
