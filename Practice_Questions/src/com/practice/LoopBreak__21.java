package com.practice;

public class LoopBreak__21 {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 15) {
			if(i == 7) {
				break;
			}
			System.out.println(i);
			i++;
		}
	}
}
