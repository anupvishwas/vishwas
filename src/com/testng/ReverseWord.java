package com.testng;


public class ReverseWord {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    String str = "the sky is blue";
    //Pattern p = Pattern.compile("\\s");
    String[] temp = str.split(" ");
    String rev = "";
    for (int i=0; i<temp.length;i++) {
      if (i==temp.length-1)
        rev = temp[i] + rev;
      else 
        rev = " "+ temp[i] + rev;
        
    }
    System.out.println(rev);
    
    
//    //char[] ch = str.toCharArray();
//    //ch.toString();
//    Pattern p = Pattern.compile("\\s");
//    System.out.println("The original string is: " + str);
//    String[] temp = p.split(str);
//    String rev = "";
//    for (int i = 0; i < temp.length; i++) {
//       if (i == temp.length - 1)
//          rev = temp[i] + rev;
//       else
//          rev = " " + temp[i] + rev;
//    }
//    System.out.println("The reversed string is: " + rev);

  }
    
//    char[] ch = new char[50];
//    String str = "the sky is blue";
//    ch = str.toCharArray();
//    System.out.println(ch);
}

//}