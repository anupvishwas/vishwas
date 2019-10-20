package com.testng;

public class StringReverseRecursive {

  public static void main(String[] args) {
    String str = "hello";
    // System.out.println(reverse("hello"));
    
    //System.out.println(str.substring(1)+str.charAt(0));
    //System.out.println(str.charAt(0));
    System.out.println("final reverse is======> "+recusrive2("anup"));
  }
  
  public static String recusrive2(String str) {
    if (str.isEmpty()) {
      return str;
    } 
      System.out.println("str.substring(1): " + str.substring(1));
      System.out.println("str.charAt(0): " + str.charAt(0));
      return recusrive2(str.substring(1)) + str.charAt(0);
  }
  
  public static String reverse(String str) {
    if (str == null || str.length() <=1) {
      System.out.print(str);
      return str;
    } else {
      System.out.print(str.charAt(str.length()-1));
      return reverse(str.substring(0, str.length()-1));
    }
  }

}
