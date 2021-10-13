package com.satishlabs.string;

import java.util.ArrayList;

public class FindSubsequences {
	public static void main(String[] args) {
		ArrayList<String> subSeq = getSubSeq("abc");
		System.out.println(subSeq);
		
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
