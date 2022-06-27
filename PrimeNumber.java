package com.turkcell.Odevler;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int count = 2;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi: ");
		int num = scan.nextInt();
		
		primeOrNot(num, count);
		System.out.println(recursivePrimeOrNot(num, count) ? num + " asal sayidir" : num + " asal sayi degildir");
		
	}
	
	public static Boolean recursivePrimeOrNot(int number, int count) {
		
		if (number <= 2)
			return (number == 2) ? true : false;
		if (number % count == 0)
			return false;
		if (number * count > number)
			return true;
		
		return recursivePrimeOrNot(number, count + 1);
	}
	
	public static void primeOrNot(int number, int count) {
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		
		System.out.println((count == 2) ? number + " asal sayidir" : number + " asal sayi degildir");
	}
	
}
