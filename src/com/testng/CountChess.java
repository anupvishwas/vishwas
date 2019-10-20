package com.testng;

public class CountChess {

  public static void main(String[] args) {
    System.out.println(countChess(2));
  }
  
  public static int countChess(int n) {
    return (n * (n + 1) / 2) * (2 * n + 1) / 3;
  }

}
