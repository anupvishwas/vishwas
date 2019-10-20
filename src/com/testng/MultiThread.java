package com.testng;




public class MultiThread {

  public static void main(String[] args) {
    A aobj = new A();
    B bobj = new B();
    
    aobj.start();
    bobj.start();
    
  }

}



class A extends Thread {
  
  public void run() {
    for (int i=0;i<5;i++) {
      System.out.println("A");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}

class B extends Thread {
  public void run() {
  for (int i=0;i<5;i++) {
    System.out.println("B");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }  
}
}