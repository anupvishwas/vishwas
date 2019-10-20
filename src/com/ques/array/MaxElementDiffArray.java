package com.ques.array;

public class MaxElementDiffArray {

  public static void main(String[] args) {
    
    int[] arr = new int[] {2,3,10,6,4,8};
    System.out.println(maxDiff(arr));

    int[] arr1 = new int[] {7,9,5,6,3,2};
    System.out.println(maxDiff(arr1));
    
    int[] arr2 = new int[] {9,8,6,4,2,1};
    System.out.println(maxDiff(arr2));
    
    int[] arr22 = new int[] {10,7,6,9,3,1};
    System.out.println(maxDiff(arr22));
    

    int[] arr3 = new int[] {3,3,3,3,3,3,3,3};
    System.out.println(maxDiff(arr3));

  }
  
  public static int maxDiff(int[] arr) {
    int n = arr.length;
    int maxDiff = -1;
    int maxRight = arr[n-1];
    
    for (int i = n-2; i>=0; i--) {
      if (arr[i] > maxRight) {
        maxRight = arr[i];
      } else {
        int diff = maxRight - arr[i];
        if (diff > maxDiff) {
          maxDiff = diff;
        }
      }
    }
    return maxDiff;
  }
}


//Given an array arr[] of integers, 
//find out the maximum difference between any 
//two elements such that larger element appears after the smaller number. 

//Examples :
//
//Input : arr = {2, 3, 10, 6, 4, 8, 1}
//Output : 8
//Explanation : The maximum difference is between 10 and 2.
//
//Input : arr = {7, 9, 5, 6, 3, 2}
//Output : 2
//Explanation : The maximum difference is between 9 and 7.

