package com.satishlabs.string;

public class StringReverse {
	public static void main(String[] args) {
		String reverse = reverse("abc xyz");
		System.out.println(reverse);
	}

	private static String reverse(String str) {
		if(str ==null || str.length() ==0) {
			return str;
		}
		
		char[] ch = str.toCharArray();
		int i=0;
		int j = str.length()-1;
		while(i <j) {
			swap(ch,i,j);
			i++;
			j--;
		}
		return new String(ch);
	}

	private static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
	}
}
