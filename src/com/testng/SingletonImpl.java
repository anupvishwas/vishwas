package com.testng;

  public class SingletonImpl {
    
    public static void main(String[] args) {
      SingletonCheck temp1 = SingletonCheck.getInstance();
      SingletonCheck temp2 = SingletonCheck.getInstance();
      System.out.println("temp1 value: " +temp1.s);
      System.out.println("temp2 value: " +temp2.s);
      
      temp1.s = temp1.s.toUpperCase();
      System.out.println("temp1 value: " +temp1.s);
      System.out.println("temp2 value: " +temp2.s);
      
      
    }

  }
  
class SingletonCheck {
  
  private static volatile SingletonCheck c = null;
  public String s = null;
  private SingletonCheck() {
    s = "anup here";
  };
  
  public static SingletonCheck getInstance() {
    if (c == null) {
      synchronized (SingletonCheck.class) {
        if (c == null) {
          c = new SingletonCheck();
        }
      }
    }
    return c; 
  }
  
}


