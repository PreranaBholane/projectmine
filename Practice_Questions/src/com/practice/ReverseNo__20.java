package com.practice;

import java.util.Scanner;

public class ReverseNo__20 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter numbers: ");
		int num = s.nextInt();
		
		while(num > 0) {
			int digit = num % 10;
			System.out.print(digit);
			
			num = num / 10;
		}

	}

}
