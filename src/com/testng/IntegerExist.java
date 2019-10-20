package com.testng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegerExist {

  public static void main(String[] args) {
    List<Integer> l = new ArrayList<Integer>();
    l.add(2);
    l.add(3);
    l.add(2);
    l.add(5);
    l.add(2);
    l.add(4);
    l.add(3);
    l.add(2);
    l.add(3);
    l.add(8);
    l.add(9);
    System.out.println("number: " + occuranceNumber(l));
  }
  
  
  public static int occuranceNumber(List<Integer> list) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    int count = 0;
    
//    for(int i=0; i<list.size(); i++) {
//      int val = list.get(i);
//      if (map.get(val) != null) {
//        map.put(val, map.get(val)+1);
//      } else {
//        map.put(val, 1);
//      }
//    }
    
    for (Integer listVal : list) {
      if(map.get(listVal) != null) {
        map.put(listVal, map.get(listVal) + 1);
      } else {
        map.put(listVal, 1);
      }
    }
    for(Integer a : map.keySet()) {
      if (map.get(a) == 1) {
        count++;
      }
    }
    return count;
    
  }
}
