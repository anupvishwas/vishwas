package com.testng;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice {

	public static void main(String[] args) {
//		String a = "abc";
//		String b = new String("abc");
//		String ag = null;
//		String x = (String)(ag);
//		System.out.println("ggg:"+ a.equals(b));
//		System.out.println("hhh:"+ a==b);
//		System.out.println("aaa"+ ag.equalsIgnoreCase("b"));
//		System.out.println("val"+ x);

		String number = "919187653567";
		Pattern pattern = Pattern.compile("^[0-9\\+]*$");
		Matcher matcher = pattern.matcher(number); 
		 if (matcher.matches()) {
		      System.out.println("Phone Number Valid");
		 } else {
		   System.out.println("Phone Number not Valid");
		 }
	}

}
