package com.testng;

public class SuperSubClass {

  public static void main(String[] args) {
    AB a = new BC();
    a.aM1();
    
    BC b =  (BC) new AB();
    b.bM1();
  }
}

class AB {
  int aid;
  String name;
  
  public void aM1() {
    System.out.println("inside oM1");
  }
}

class BC extends AB {
  
  @Override
  public void aM1() {
    System.out.println("override");
    //super.aM1();
  }
  
  public void bM1() {
    System.out.println("inside bM1");
  }
  
}
