package com.testng;

public class LenearSearch {

	public static void main(String[] args) {
		int a[] = {22, 17, 88, 94, 96, 27, 94, 109, 982, 95};
		int input = 94;
		System.out.println("output:"+ lenearSearch(a, input));
	}
	
	private static int lenearSearch(int a[], int input) {
		for(int i=0; i<a.length; i++) {
			if (a[i] == input) {
				return i;
			}
		}
		return -1;
	}

}
