package com.satishlabs.string;

import java.util.Arrays;

public class AnagramProgram {
	public static void main(String[] args) {
		 isAnagram("keEp", "peeK");
	}

	private static void isAnagram(String str1, String str2) {
		//Removing all white spaces from s1 and s2
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		
		 //Initially setting status as true
		boolean status = true;
		if(s1.length() != s2.length()) {
			  //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
			status = false;
		}
		else {
			char[] s1Arr1 = s1.toCharArray();
			char[] s2Arr2 = s2.toCharArray();
			Arrays.sort(s1Arr1);
			Arrays.sort(s2Arr2);
			
			status = Arrays.equals(s1Arr1, s2Arr2);
		}
		if(status) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
	}
}
