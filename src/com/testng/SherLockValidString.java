package com.testng;

import java.util.HashMap;
import java.util.Map;

public class SherLockValidString {

  public static void main(String[] args) {
    System.out.println(isValid("aabbcd"));
    System.out.println(isValid("abcdefghhgfedecba"));
    System.out.println(isValid("aabbcd"));

  }
  
  public static String isValid(String s) {
    
    Map<Character, Integer> m = new HashMap<Character, Integer>();
    for (int i=0; i<s.length(); i++) {
        if (m.get(s.charAt(i)) != null) {
            m.put(s.charAt(i), m.get(s.charAt(i))+1);
        } else {
            m.put(s.charAt(i), 1);
        }
    }
    
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    if (m.size() <= 1) {
      return "YES";
    }
    for (int val: m.values()) {
      if (val > max) {
        max = val;
      }
      if (val < min) {
        min = val;
      }
    }
    
    if (min == max ) {
      return "YES";
    }
    if ((max - min) > 1) {
      return "NO";
    }
    
    int countBiggerThanMin = 0;
    for (int val: m.values()) {
      if (val > min) {
        countBiggerThanMin++;
      }
    }
    if((countBiggerThanMin == 1) || //only one bigger than min
        (countBiggerThanMin == (m.size() - 1))) { //min is samller than all others
    return "YES";
}
return "NO";
    

  }

}
