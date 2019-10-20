package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

  public static void main(String[] args) {
    List<Laptop> l = new ArrayList<Laptop>(); 
    l.add(new Laptop("Dell", 16 , 1700));
    l.add(new Laptop("Apple", 8 , 2200));
    l.add(new Laptop("Lenovo", 4 , 900));

    List<Laptop1> l2 = new ArrayList<Laptop1>(); 
    l2.add(new Laptop1("Dell", 16 , 1700));
    l2.add(new Laptop1("Apple", 16 , 2200));
    l2.add(new Laptop1("Lenovo", 4 , 900));
    l2.add(new Laptop1("Acer", 16 , 200));
    l2.add(new Laptop1("Carbon", 8 , 700));

     // Using Comparable
     Collections.sort(l);
    
    
    // Using Comparator
    
    Comparator<Laptop1> com = new Comparator<Laptop1>() {

      @Override
      public int compare(Laptop1 o1, Laptop1 o2) {
        int c;
        c = ((Integer)o1.getRam()).compareTo((Integer)o2.getRam());
        if (c == 0)
          c = o1.getBrand().compareTo(o2.getBrand());
        
        return c;
      }
    };
    
    Collections.sort(l2, com);
    
    for(Laptop1 lap : l2) {
      System.out.println(lap);
    }

  }

}
