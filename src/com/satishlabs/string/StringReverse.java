package com.satishlabs.string;

public class StringReverse {
	public static void main(String[] args) {
		String reverse = reverse("abc xyz");
		System.out.println(reverse);
		String reverse1 = reverse1("abc xyz");
		System.out.println(reverse1);
	}

	private static String reverse1(String str) {
		char[] ch = str.toCharArray();
		String str1="";
		for(int i=str.length()-1; i>=0; i--) {
			str1=str1+ch[i];
		}
		return str1;
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
