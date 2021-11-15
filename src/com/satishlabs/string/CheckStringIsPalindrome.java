package com.satishlabs.string;

import java.util.Scanner;

public class CheckStringIsPalindrome {
	public static void main(String[] args) {
		System.out.println("Enter the input String");
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.next();
		if(isPalindrome(inputStr)) {
			System.out.println(inputStr+" is Palindrome");
		}else {
			System.out.println(inputStr+" is not Palindrome");
		}
	}

	private static boolean isPalindrome(String inputStr) {
		String newStr = inputStr.replaceAll("//s", "").toLowerCase();
		int i=0;
		int j = inputStr.length()-1;
		while(i<j) {
			if(newStr.charAt(i) != newStr.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
