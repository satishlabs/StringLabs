package com.satishlabs.string;

public class StringPermutation {
	public static void main(String[] args) {
		String str="JSP";
		printPermutation(str,"");
	}

	private static void printPermutation(String str, String ans) {
		if(str.length() == 0) {
			System.out.println(ans+" ");
			return;
		}
		for(int i=0; i<str.length(); i++) {
			// ith character of str 
			char c= str.charAt(i);
			// Rest of the string after excluding  
            // the ith character 
			String res = str.substring(0, i)+str.substring(i+1);
			
			//Recurvise call
			printPermutation(res, ans+c);
		}
		
	}
}
