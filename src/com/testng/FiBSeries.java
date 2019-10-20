package com.testng;

public class FiBSeries {

  public static void main(String[] args) {
    System.out.println(fib(3));

  }
  
  public static int fib(int n) {
    if (n>=3) {
      return fib(n-1)+fib(n-2);
    } else {
      return 1;
    }
  }

}
