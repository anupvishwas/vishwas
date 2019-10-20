package com.ques.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArraySet {

  public static void main(String[] args) {
    int[] arr = new int[] {8,8,8,8, 9, 6, 7};
    System.out.println(isSame(arr));

  }
  
  // check whether array has all indentical elements
  public static boolean isSame(int[] arr) {
    Set s = new HashSet();
    for (int i=0; i<arr.length; i++) {
      s.add(arr[i]);
    }
    
//    Set s = new HashSet(Arrays.asList(arr));
//    Iterator it =  s.iterator();
    System.out.println(s.size());
    if (s.size() == 1 || s.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

}
