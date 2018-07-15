package com.aspart.art.number;

public class NumberTest {

	
	public static void main(String[] args) {
		int i = 5;
		Integer itg = new Integer(i);
		int i2 = itg.intValue();
		System.out.println(i2);
		
		double d = 1.23;
//		Double db = new Double(d);
		Double db = d;
		double d2 = db;
		System.out.println(d2);
		System.out.println(db.doubleValue());
		
		
		System.out.println(itg instanceof Number);
		System.out.println(db instanceof Number);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println(Byte.SIZE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		byte b1 = 2;
		Integer itg2 = (int) d;
//		byte b2 = itg2;
		System.out.println(itg2.toString());
		System.out.println(String.valueOf(itg2));
		
		System.out.println(String.valueOf(itg2) instanceof String);
//		System.out.println(String.valueOf(itg2) instanceof Integer);
		
		String str = "3.1a4";
		System.out.println(Double.parseDouble(str));
		
		
	}
}
