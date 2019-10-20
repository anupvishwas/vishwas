package com.abc;

public class ClassA implements InterfaceA {
  
  public static void main(String[] args) {
    //ClassA obj = new ClassA();
    InterfaceA obj = new ClassA();
    obj.show();
    obj.display();
    
  }

  @Override
  public void show() {
    System.out.println("show");
    
  }
  
  public void display() {
    System.out.println("display");
  }

}
