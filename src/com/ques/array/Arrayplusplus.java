package com.ques.array;

public class Arrayplusplus {

  public static void main(String[] args) {
    
    int[] arr = new int[5];
    for (int i=0; i<arr.length; i++) {
      arr[i] = i++;
    }
    
    for (int i=0; i<arr.length; i++) {
      System.out.print(arr[i]+",");
    }


  }

}
