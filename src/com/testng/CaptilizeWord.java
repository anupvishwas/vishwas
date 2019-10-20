package com.testng;

public class CaptilizeWord {

  public static void main(String[] args) {
    System.out.println(captilizeWord("gEEks fOr GeeKs"));

  }
  
  public static String captilizeWord(String str) {
    
    StringBuffer s = new StringBuffer();
    
    char ch = ' ';
    
    for (int i=0;i<str.length(); i++) {
      if (ch == ' ' && str.charAt(i) != ' ') {
        s.append(Character.toUpperCase(str.charAt(i)));
      } else {
        s.append(Character.toLowerCase(str.charAt(i)));
      }
      ch = str.charAt(i);
    }
    
    return s.toString().trim();
  }

}
