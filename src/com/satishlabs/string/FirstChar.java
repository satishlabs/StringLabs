package com.satishlabs.string;

public class FirstChar {
	public static void main(String[] args) {
		String str ="Hello Satish";
		firstChar(str);
	}

	private static void firstChar(String str) {
		String[] strArr = str.split(" ");
		for(String  s: strArr) {
			//char c = s.charAt(0);
			System.out.println(s+" of First char : "+s.charAt(0)+" and Last char : "+s.charAt(s.length()-1)); 
			
			
		}
		
	}
}
