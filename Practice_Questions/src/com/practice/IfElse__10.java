package com.practice;

import java.util.Scanner;

public class IfElse__10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = s.nextInt();
		
		if(age>18) {
			System.out.println("You are eligible for voting");
		}
		else {
			System.out.println("You are not eligible");
		}

	}

}
