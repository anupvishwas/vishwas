package com.testng;

public class PrimeNumberRecursion {

  public static void main(String[] args) {
    int num =2;
    System.out.println(isPrime(num, num/2));

  }
  
  public static boolean isPrime(int num, int i) {

    if (i == 1) {
      return true;
    } else {
      if (num%i==0) {
        return false;
      } else {
        return isPrime(num, i-1);
      }
    }
  }

}
