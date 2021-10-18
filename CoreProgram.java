package com.bridgelabz;

import java.util.Scanner;
public class CoreProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Charactor:");
		char ch = sc.next().charAt(0);
		if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
			System.out.println("Given charactor is Vowel");
		}
		else {
			System.out.println("Given charactor is Consonant");
		}
	}
}
