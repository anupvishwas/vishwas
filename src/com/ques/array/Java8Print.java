package com.ques.array;

import java.util.ArrayList;
import java.util.List;

public class Java8Print {

  public static void main(String[] args) {
    List names = new ArrayList();
    
    names.add("Mahesh");
    names.add("Suresh");
    names.add("Ramesh");
    names.add("Naresh");
    names.add("Kalpesh");
      
    names.forEach(System.out::println);

  }

}


