package com.ques.array;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingchar {

  public static void main(String[] args) {
    String str = "anupvihws";
    System.out.println(nonRepChar(str));

  }
  
  public static char nonRepChar(String str) {
    
    Map<Character, Integer> m = new HashMap<Character, Integer>();
    
    for (int i=0; i<str.length(); i++) {
      char keyStr = str.charAt(i);
      if (m.containsKey(str.charAt(i))) {
        m.put(keyStr, m.get(keyStr) + 1);
      } else {
        m.put(keyStr, 1);
      }
    }
    
    for (char c : m.keySet()) {
      if (m.get(c) > 1) 
        return c;
    }
    return 'n';
  }

}
