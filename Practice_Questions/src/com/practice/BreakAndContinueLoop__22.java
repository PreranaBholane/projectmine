package com.practice;

public class BreakAndContinueLoop__22 {

	public static void main(String[] args) {
		int i = 0;
		
		while(i <= 10) {
			i++;
			if(i == 2) {
				continue;
			}
			if(i == 8) {
				break;
			}
			System.out.println(i);
		}

	}

}
