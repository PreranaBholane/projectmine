package com.practice;

import java.util.Scanner;

public class SwappingWithoutThirdVar__7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a = s.nextInt();
		
		System.out.println("Enter second number:");
		int b = s.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("------After Swapping------");
		System.out.println("First Number:"+a);
		System.out.println("Second Number:"+b);
	}

}
