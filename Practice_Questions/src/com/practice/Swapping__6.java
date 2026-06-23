package com.practice;

import java.util.Scanner;

public class Swapping__6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a = s.nextInt();
		
		System.out.println("Enter second number:");
		int b = s.nextInt();
		
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("------After Swapping------");
		System.out.println("First number a:"+a);
		System.out.println("Second number b:"+b);

	}

}
