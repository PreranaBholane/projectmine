package com.practice;

import java.util.Scanner;

public class SubstringOfString__29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("All Substrings are:");

        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
	}

}
