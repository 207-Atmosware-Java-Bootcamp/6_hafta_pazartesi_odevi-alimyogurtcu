package com.turkcell.Odevler;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kelime giriniz: ");
		String enterString = scanner.next();
		String reverseString = "";
		for (int i = enterString.length() - 1; i >= 0; i--) {
			reverseString += enterString.charAt(i);
		}
		boolean palindrome = reverseString.equals(enterString);
		System.out.println(palindrome ? "Kelime palindromedur" : "Kelime palindrome degildir");
		
	}
	
}
