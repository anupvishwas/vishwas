package com.ques.array;

public class TwoString {

  public static void main(String[] args) {
    System.out.println(twoStrings("hello", "Hi"));
    System.out.println(-7*-2 > 13);
    System.out.println(Integer.MIN_VALUE);

  }
  
  static String twoStrings(String s1, String s2) {
    String retVal = "NO";
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    for(char c : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {
        if (s1.indexOf(c) > -1 && s2.indexOf(c) > -1) {
            retVal = "YES";
            break;
        }
    }
    return retVal;
}

}


//Given two strings, determine if they share a common substring. A substring may be as small as one character.
//
//For example, the words "a", "and", "art" share the common substring a. The words "be" and "cat" do not share a substring.



//The complexity of Java's implementation of indexOf is O(m*n) 
//where n and m are the length of the search string and pattern respectively.
