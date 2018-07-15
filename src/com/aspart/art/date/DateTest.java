package com.aspart.art.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
//		System.out.println(new Date());
//		System.out.println(new Date(5000));
		System.out.println(now.getTime());
		System.out.println(System.currentTimeMillis());
		
		Random rd = new Random();
		int rdint = rd.nextInt();
		System.out.println(rdint);
		System.out.println(new Date(rdint));
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
		System.out.println(sdf.format(now));
	}
}
