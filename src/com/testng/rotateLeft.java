package com.testng;

import java.util.Arrays;

public class rotateLeft {

  public static void main(String[] args) {
    int[] a = new int[5];
    a[0] = 1;
    a[1] = 2;
    a[2] = 3;
    a[3] = 4;
    a[4] = 5;
    
    System.out.println(Arrays.toString(retLeft(a, 2)));
    
  }
  
  public static int[] retLeft(int[] a, int d) {
    int n = a.length;
    int[] b = new int[n];
    for (int i=0; i<n ; i++) {
      b[i] = a[(i+d)%n];
    }
   return b;
  }

}
