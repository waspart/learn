package com.aspart.art.string;

public class StringTest {
	
	public static void main(String[] args) {
		String str1 = "the";
		String str2 = new String(str1);
		String str3 = "the light";
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str1);
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));
		
		StringBuffer sb = new StringBuffer(str1);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}
