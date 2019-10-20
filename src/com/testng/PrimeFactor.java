package com.testng;

public class PrimeFactor {

	public static void main(String[] args) {
		int n = 16;
		System.out.println("divide"+7%7);
		System.out.println("sqrt: "+ Math.sqrt(24));
//		while (n%2 == 0) {
//			System.out.print(2 + " ");
//			n = n/2;
//		}
		
		for (int i=2; i<=Math.sqrt(n); i+=1) {
			//System.out.println("i outer"+ i);
			while(n%i==0) {
				System.out.print(i + " ");
				n = n/i;
				//System.out.println("n:"+ n);
			}
		}
		
	if (n > 1)	
		System.out.print(n);

	}

}
