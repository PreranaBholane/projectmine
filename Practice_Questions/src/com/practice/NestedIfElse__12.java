package com.practice;

import java.util.Scanner;

public class NestedIfElse__12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Marks:");
		int marks = s.nextInt();
		
		if(marks >= 90) {
			System.out.println("Excellent !!!");
		}
		else if(marks > 75){
			System.out.println("Good !");
		}
		else if(marks > 45){
			System.out.println("Average...");
		}
		else {
			System.out.println("Fail");
		}
	}
}