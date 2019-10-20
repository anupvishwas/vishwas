package com.testng;

public class ReverseStringWord {

  public static void main(String[] args) {
    String ip = "I AM HARDCORE TECHIE" ;
    System.out.println("Str: " +revString(ip));
  }
  
  public static String revString(String str) {
    String[] words = str.split(" ");
    String reversedString = "";
    for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
           for (int j = word.length()-1; j >= 0; j--) 
       {
        /* The charAt() function returns the character
         * at the given position in a string
         */
        reverseWord = reverseWord + word.charAt(j);
       }
       reversedString = reversedString + reverseWord + " ";
    }
    //System.out.println(str);
    //System.out.println(reversedString);
    return reversedString;
}
  
}



//Write a function to reverse the string without using any inbuilt function. 
//Input : “I AM HARDCORE TECHIE” op :”I MA EROCDRAH EIHCET” 


