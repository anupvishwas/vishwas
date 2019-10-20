package com.testng;

public class FrogJump {

  public static void main(String[] args) {
    //System.out.println(numWays(4));
    System.out.println(numWaysUsingArr(4));

  }
  
//  public static int numWays(int n) {
//    if (n == 0 || n == 1) {
//      return 1;
//    } else {
//      return numWays(n-1) + numWays(n-2);
//    }
//  }
  
  public static int numWaysUsingArr(int n) {
    if (n == 0 || n == 1) 
      return 1;
    int[] num = new int[n+1];
    num[0] = 1;
    num[1] = 1;
    for (int i = 2; i<=n; i++) {
      num[i] = num[i-1]+num[i-2];
    }
    return num[n];
  }

}
