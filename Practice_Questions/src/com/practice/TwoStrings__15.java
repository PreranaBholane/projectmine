package com.practice;

import java.util.Scanner;

public class TwoStrings__15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first string: ");
		String s1 = s.nextLine();
		
		System.out.println("Enter second string: ");
		String s2 = s.nextLine();
		
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}

	}

}
