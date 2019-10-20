package com.ques.array;

import java.util.Arrays;

public class RotateArray {

  public static void main(String[] args) {
    
    int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7};
    int d = 2;
    
    for (int i=0; i<d; i++) {
      leftArrayByOne(arr);
    }
    System.out.println(Arrays.toString(arr));

  }
  
  static void leftArrayByOne(int arr[]) {
    int i;
    int temp = arr[0];
    for (i=0; i<arr.length-1; i++) {
      arr[i] = arr[i+1];      
    }
    arr[i] = temp;    
  }

}
