 package com.practice;

import java.util.Scanner;

public class EvenOdd__13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Any Number:");
		int num = s.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("It is Even Number");
		}
		else {
			System.out.println("It is Odd Number");
		}
	}
}
