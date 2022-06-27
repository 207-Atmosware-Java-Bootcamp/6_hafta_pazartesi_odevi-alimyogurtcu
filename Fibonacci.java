package com.turkcell.Odevler;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Adim: ");
		int num = scan.nextInt();
		
		fibonacci(num);
		
		System.out.println("\n\nRecursive");
		
		for (int i = 0; i < num; i++) {
			System.out.print(recursiveFibonacci(i) + " ");
		}
	}
	
	static void fibonacci(int number) {
		int num1 = 0, num2 = 1;
		int counter = 0;
		
		while (counter < number) {
			
			System.out.print(num1 + " ");
			
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}
	}
	
	static int recursiveFibonacci(int number) {
		if (number <= 1)
			return number;
		
		return recursiveFibonacci(number - 1) + recursiveFibonacci(number - 2);
	}
	
}
