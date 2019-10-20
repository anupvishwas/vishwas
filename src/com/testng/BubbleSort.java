package com.testng;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = new int[7];
		a[0] = 3;
		a[1] = 9;
		a[2] = 4;
		a[3] = 2;
		a[4] = 9;
		a[5] = 2;
		a[6] = 11;
		//boolean flag = true;
		sortBubble(a);
		System.out.println("search input:"+ binarySearch(a, 2));
//		for (int i=0; i< a.length-1 && flag; i++){
//			flag = false;
//			for (int j=0; j < a.length-i-1; j++) {
//				if (a[j] > a[j+1]) {
//					flag = true;
//					int temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//		}
		for (int k=0; k<a.length-1; k++) {
		System.out.println(a[k]+ " ");
		}
	}
	
	public static void sortBubble(int a[]) {
		int n=a.length;
		boolean flag = true;
		for (int i=0; i<n && flag; i++) {
			flag = false;
			for (int j=0; j<n-i-1; j++) {
				if (a[j] > a[j+1]) {
					flag = true;
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
		
	}
	
	public static int binarySearch(int a[], int input) {
		int start = 0;
		int end = a.length;
		int mid;
		
		while (start <= end) {
			mid = (start+end)/2;
			if (a[mid] == input) {
				return mid;
			} else if (input < a[mid]) {
				end = mid - 1;
			} else if (input > a[mid]) {
				start = mid + 1;
			}
		}	
		return -1;
	}
}
