package com.turkcell.Odevler;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi: ");
		int number = scan.nextInt();
		int temp = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0)
				temp += i;
		}
		
		System.out.println((temp == number) ? (number + " mukkemmel sayidir") : (number + " mukkemmel sayi degildir"));
		
	}
	
}
