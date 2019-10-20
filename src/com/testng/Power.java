package com.testng;

public class Power {

	public static void main(String[] args) {
		int x = 6;
		System.out.println("jj "+ IsPowerOfTwo(x));

	}
	
	public static boolean IsPowerOfTwo(int x) {
		System.out.println("hshsss: "+ (x & (x - 1)));
	    return (x > 0) && ((x & (x - 1)) == 0);
	}

}
