package com.testng;

public class PrimeBetTwo {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		findPrime(x, y);
		
	}
	
	private static void findPrime(int x, int y) {
		for (int i=x+1; i<y; i++) {
			for (int j=2; j<=i/2; j++) {
				if (i%j == 0) {
					break;
				}
				if (j==i/2) {
					System.out.println(i+ " ");
				}
			}
		}
	}

}
