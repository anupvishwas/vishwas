package com.testng;

import java.util.HashMap;
import java.util.Map;

public class HashCodeandEquals {

  public static void main(String[] args) {
    
    Map<Employee, String> map = new HashMap<Employee, String>();
    Employee e1 = new Employee(1);
    Employee e2 = new Employee(1);
    
    System.out.println(e1.hashCode()+ "," + e2.hashCode());
    map.put(e1, "anup");
    map.put(e2, "anup");
    
    System.out.println(map.size());
    
    Integer i1 = new Integer(1);
    Integer i2 = new Integer(1);
    System.out.println(i1.hashCode()+ "," + i2.hashCode());

    Map<Integer, String> map1 = new HashMap<Integer, String>();
    map1.put(i1, "one");
    map1.put(i2, "one");
    
    System.out.println(map1.size());
  }

}


class Employee {
  int id;
  public Employee(int id) {
    this.id = id;
  }
//  @Override
//  public int hashCode() {
//    final int prime = 31;
//    int result = 1;
//    result = prime * result + id;
//    return result;
//  }
//  @Override
//  public boolean equals(Object obj) {
//    if (this == obj)
//      return true;
//    if (obj == null)
//      return false;
//    if (getClass() != obj.getClass())
//      return false;
//    Employee other = (Employee) obj;
//    if (id != other.id)
//      return false;
//    return true;
//  }
  
  
  
}
