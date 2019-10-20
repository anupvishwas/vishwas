package com.testng;

public class MultiThreadUsingInterface {

  public static void main(String[] args) {

    X aobj = new X();
    Y bobj = new Y();
    
    Thread t1 = new Thread(aobj);
    Thread t2 = new Thread(bobj);
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

class X implements Runnable {
  public void run() {
    System.out.println("A");
  }
}

class Y implements Runnable {
  public void run() {
    System.out.println("B");
  }
}

