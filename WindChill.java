package com.bridgelabz;

import java.util.Scanner;
public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature:");
		double t = sc.nextDouble();
		System.out.println("Enter the Wind speed");
		double v = sc.nextDouble();
		double WindChill = 35.74 + 0.6215 * t +(0.4275*t - 35.75) * Math.pow(v, 0.16);
		System.out.println("Given temperature of " + t +" Fahrenheit " + " a wind speed of " + v + " mph ");
		System.out.println("The Wind Chill is " + WindChill);
	}	

}
