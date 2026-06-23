 package com.practice;

import java.util.Scanner;

public class Factorial__14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Any Number:");
		int n = s.nextInt();
		
		int fact = 1;
		
		for (int i = 1; i <=n ; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial of given number is: "+fact);
	}

}
