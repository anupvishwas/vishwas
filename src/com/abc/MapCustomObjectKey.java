package com.abc;

import java.util.HashMap;
import java.util.Map;

public class MapCustomObjectKey {

  public static void main(String[] args) {
    
    Map<Object, Object> m = new HashMap<Object, Object>();
    
    Employee e1 = new Employee(1, "anup");
    Employee e2 = new Employee(2, "cvv");
    
    m.put(e1, "abc");
    m.put(e2, "xyz");
    
//    Employee e3 = (Employee) m.get(e1);
   
    System.out.println(m.get(e1));
    System.out.println(m.get(e2));
    
    System.out.println((m.get(e1)).hashCode());
    System.out.println((m.get(e2)).hashCode());

  }
}

class Employee {
  
  int id;
  String name;
  
  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
}


