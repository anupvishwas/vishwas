package com.ques.array;

public class ArrayStoreException {

  public static void main(String[] args) {
    
    
    //int[] a = new int[5];
    //a[0] = "aa"; // it will give compile time exception
    
    Object[] arr = new String[5];
    arr[0] = 23;
    
    System.out.println(arr);

  }

}
