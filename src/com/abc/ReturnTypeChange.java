package com.abc;

public class ReturnTypeChange {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}


interface A {
  void m1(Object obj);
}

class X implements A {

  @Override
  public void m1(Integer i) {
    System.out.println("inside A");
  }
  
}
