package com.testng;

public class MultithreadingUsingLamda {

  public static void main(String[] args) {
    Runnable pobj = new Runnable() {
      public void run() {
        System.out.println("P");
      }
    };
    Runnable kobj = new Runnable() {
      public void run() {
        System.out.println("K");
      }
    };
    
    
    Thread t1 = new Thread(pobj);
    Thread t2 = new Thread(kobj);
    
    t1.start();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    t2.start();
    
    
    

  }

}


