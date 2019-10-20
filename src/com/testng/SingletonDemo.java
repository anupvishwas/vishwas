package com.testng;

public class SingletonDemo {

  public static void main(String[] args) {

//    Singleton temp = Singleton.getInstance();
//    temp.demoMethod();
//    
//    Singleton temp1 = Singleton.getInstance();
//    temp1.demoMethod();
    
    
    
    Singleton temp = Singleton.getInstance();
    Singleton temp1 = Singleton.getInstance();
    temp.s = (temp.s).toUpperCase();
    System.out.println("abc: " + temp.s);
    System.out.println("def: " + temp1.s);
    
    Singleton temp2 = Singleton.getInstance();
    temp2.s = (temp2.s).toLowerCase();
    System.out.println("zzz: " +temp2.s);
    System.out.println("yyy: " +temp.s);
  }

}
