package com.testng;

public class Factoril {

  public static void main(String[] args) {
    int fact = 1;
    int num = 5;
    for (int i=1; i<=num; i++) {
      fact = fact*i;
    }
    System.out.println(fact);
    System.out.println(factRecursion(num));
  }
  
  public static int factRecursion(int num) {
    if (num >=1) {
      return num*factRecursion(num-1);
    } else {
      return 1;
    }
  }

}
