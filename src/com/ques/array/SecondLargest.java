package com.ques.array;

public class SecondLargest {

  public static void main(String[] args) {
    int arr[] = new int[]{3,9,5,8,7,16};
    System.out.println(secondLargest(arr));

  }
  
  public static int secondLargest(int[] arr) {
    
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    int third = Integer.MIN_VALUE;
    
    for (int i=0; i<arr.length-1; i++) {
      if (arr[i] > first) {
        second = first;
        third = second;
        first = arr[i];
        
     } else if (arr[i] > second) {
        third = second;
        second = arr[i];
     } else if (arr[i] > third) {
       third = arr[i];
     }

    }
    return third;
  }

}
