package com.ques.array;

import java.util.Arrays;

public class FindSum {

  public static void main(String[] args) {
    int arr[] = new int[] {2, 6, 8, 15, 5, 4, 7};
    System.out.println(isSumAvl(arr, 20));

  }
  
  public static boolean isSumAvl(int arr[], int sum) {
    Thread.activeCount();
    Arrays.sort(arr);
    int i=0;
    int j=arr.length-1;
    while (i<j) {
      if (arr[i] + arr[j] == sum) {
        return true;
      } else if (arr[i] + arr[j] < sum) {
        i++;
      } else {
        j--;
      }
    }
    return false;
  }

}
