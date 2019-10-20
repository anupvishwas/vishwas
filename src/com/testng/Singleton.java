package com.testng;

public class Singleton {
  
  // early instantiation
//  private static Singleton singleton = new Singleton();
//  
//  private Singleton() {}
//  
//  public static Singleton getInstance() {
//    return singleton;
//  }
//  
//  public static void demoMethod() {
//    System.out.println("demo method");
//  }
  
  // lazy instantiation
  
  private static Singleton singleton = null;
  public String s = null;
  private Singleton() {
    s = "Hello I am a string part of Singleton class"; 
  }
  
  public static Singleton getInstance() {
    if (singleton != null)
      return singleton;
    synchronized (Singleton.class) {
      if (singleton == null) {
        singleton = new Singleton();
      }      
    }
    return singleton;
  }
  
  
  public void demoMethod() {
    System.out.println("demo method");
  }
  
}

