package com.testng;

public class StringToInt {

  public static void main(String[] args) {
    System.out.println(isConvertable("1234"));

  }
  
  public static boolean isConvertable(String input) {
    try {
      Integer.parseInt(input);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }   
  }

}
