package com.ques.array;

import java.util.Arrays;

public class ArrayReverse {

  public static void main(String[] args) {
    int[] arr = new int[]{3,8,6,1,5,9,6,8};
    
    System.out.println(Arrays.toString(reverseArray(arr, arr.length)));
  }
  
  public static int[] reverseArray(int[] arr, int n) {
    
    for (int i=0; i<n/2; i++) {
      int t = arr[i];
      arr[i] = arr[n-i-1];
      arr[n-i-1] = t;
    }
    return arr;
  }

}
