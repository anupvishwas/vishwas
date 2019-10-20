package com.testng;

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String str = "ABC #";
    System.out.println("str one " + str);
    String str2 = str.replaceAll("#", "CC");
    
    System.out.println("original tring " +str);
    System.out.println("str two " +str2);

  }

}
