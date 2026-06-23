package com.practice;

import java.util.Scanner;

public class PrimeNo__26 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int n = s.nextInt();
		
		int count = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				count++;
			}
			
		}
		if(count == 2) {
			System.out.println("It is a prime number");
		}
		else {
			System.out.println("It is not prime number");
		}

	}

}
