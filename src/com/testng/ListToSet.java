package com.testng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListToSet {

  public static void main(String[] args) {
    List list = new ArrayList();
    list.add("anup");
    list.add("anup");
    list.add("lal");
    list.add("vishwas");
    list.add("vishwa");
//    System.out.println("set size: " +(convertToSet(list)).size());
//    System.out.println("list size: " +list.size());
//    System.out.println("Using constructoe: " +(new HashSet(list)).size());
    
    String st1 = new String("anup");
    String st2 = new String("anup");
    String st3 = "anup";
    String st4 = "anup";
    System.out.println(st1 == st2);
    System.out.println(st3 == st4);
    
    int i = 5;
    Map m = new HashMap();
    m.put(i, "j");
    System.out.println(m.keySet());
    

  }

  public static Set convertToSet(List l) {
//    Set s = new HashSet();
//    for (Object o: l) {
//      s.add(o);
//    }
//    return s;
//  }
    return new HashSet(l);
  }
}
