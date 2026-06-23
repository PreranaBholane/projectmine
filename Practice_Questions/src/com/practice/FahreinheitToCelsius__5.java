package com.practice;

import java.util.Scanner;

public class FahreinheitToCelsius__5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		 System.out.println("Enter temperature in fahreinheit:");
		 double fahreinheit= s.nextDouble();
		 
		 double celsius = (fahreinheit - 32) * 5 / 9;
		 
		 System.out.println("Temperature in Celsius is:"+celsius);
		 

	}

}
