package com.testng;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

  public static void main(String[] args) {
    
    System.out.println(makeAnagram("cde", "abc")); // 4
    System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke")); //30
    
  }
  
  public static int makeAnagram(String a, String b) {
    Map<Character, Integer> m = new HashMap<Character, Integer>();
    int count = 0;
    for (int i=0; i<a.length(); i++) {
      if (m.get(a.charAt(i)) != null) {
        m.put(a.charAt(i), m.get(a.charAt(i))+1);
      } else {
        m.put(a.charAt(i), 1);
      }
    }

    for (int i=0; i<b.length(); i++) {
      if (m.get(b.charAt(i)) != null && m.get(b.charAt(i)) > 0) {
        m.put(b.charAt(i), m.get(b.charAt(i))-1);
      } else {
        count++;
      }
    }
    
    for (char c: m.keySet()) {
      if (m.get(c) != 0) {
        count = count + m.get(c);
      }
    }
    
    return count;
  }

}
