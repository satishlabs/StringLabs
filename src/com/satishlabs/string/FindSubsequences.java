package com.satishlabs.string;

//Print All subsequences of given String
//String str="abc"
//Output: a, b, ab, c, ac, bc, abc

import java.util.ArrayList;
import java.util.List;

public class FindSubsequences {
	 static List<String> al = new ArrayList<>();
	 
	public static void main(String[] args) {
		String str="abc";
		ArrayList<String> subSeq = getSubSeq(str);
		System.out.println(subSeq);
		System.out.println();
		System.out.println("======================");
		findsubsequences(str, ""); // Calling a function
        System.out.println(al);
		
	}

	public static void findsubsequences(String s, String str) {
		if(s.length() ==0) {
			al.add(str);//
			return;
		}
		// TODO Auto-generated method stub
		findsubsequences(s.substring(1), str+s.charAt(0));
		findsubsequences(s.substring(1), str);
		
	}

	private static ArrayList<String> getSubSeq(String str) {
		if(str.length() == 0) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myResult = new ArrayList<String>();
		ArrayList<String> recResult = getSubSeq(ros);
		for(int i=0; i<recResult.size(); i++) {
			myResult.add(recResult.get(i));
			myResult.add(ch+recResult.get(i));
		}
		return myResult;
	}
}
