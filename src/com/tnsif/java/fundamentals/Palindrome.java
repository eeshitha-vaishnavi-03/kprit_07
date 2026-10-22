package com.tnsif.java.fundamentals;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num =sc.nextInt();
		
		System.out.print("Enter a string: ");
		String str = sc.next();
		
		int original = num;
		int reverse = 0;
		
		while(num>0) {
			int digit = num % 10;
			reverse= reverse * 10 + digit;
			num = num /10;
			
		}
		
		if(original == reverse) {
			System.out.println("Given Number is a Palindrome");
		}
		else {
			System.out.println("Given Number is not a Palindrome");
		}
		
		String rev = "";
		for(int i = str.length() -1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		
		
		if (str.equals(rev)) {
			System.out.println("Given String is a Palindrome");
		}
		else {
			System.out.println("Given String is not a Palindrome");
		}
		
		sc.close();
		
	}
}

