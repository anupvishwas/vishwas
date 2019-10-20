package com.ques.array;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RepeatedWordInText {

  public static void main(String[] args) throws IOException {
    // TODO Auto-generated method stub
    FileReader file = new FileReader("data.txt");
    BufferedReader br = new BufferedReader(file);
    Map<Object, Integer> m = new HashMap<Object, Integer>();
    
    while(br.readLine() != null) {
      String string[] = br.readLine().toLowerCase().split("([,.\\s]+) ");
      
      
    }
    

  }
  
  

}
