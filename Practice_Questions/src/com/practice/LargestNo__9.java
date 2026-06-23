package com.practice;

import java.util.Scanner;

public class LargestNo__9 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first no:");
		int a = s.nextInt();
		
		System.out.println("Enter second no:");
		int b = s.nextInt();
		
		if (a > b) {
			System.out.println("Largest no is:"+a);
		}else {
			System.out.println("Largest no is:"+b);
		}

	}

}
