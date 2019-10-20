package com.ques.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveOccurance {

  public static void main(String[] args) {
    int arr[] = new int[] {6,8,2,9,7,2,7,8};
    System.out.println(Arrays.toString(removeOccurance(arr, 8)));

  }
  
  public static Object[] removeOccurance(int[] arr, int ip) {
    List l = new ArrayList();
    for (int i=0; i<arr.length; i++) {
      if (arr[i] != ip) {
        l.add(arr[i]);
      }
    }
    return l.toArray();
  } 

}
