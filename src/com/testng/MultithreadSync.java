package com.testng;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MultithreadSync {

  public static void main(String[] args) throws Exception{

    Counter c = new Counter();
    
    Thread t1 = new Thread(c);
    Thread t2 = new Thread(c);
    Thread t3 = new Thread(c);
    Thread t4 = new Thread(c);
    Thread t5 = new Thread(c);

    t1.start();
    t1.join();
    t2.start();
    t2.join();
    t3.start();
    t3.join();
    t4.start();
    t4.join();
    t5.start();
    t5.join();
  }
}


class Counter implements Runnable {
  BlockingQueue<Integer> q = new LinkedBlockingQueue<Integer>();
  Counter next = null;
  
  
  int count;
    
  public void run() {
    for(int i=0; i< 1000; i++) {
      count++;
    }
    System.out.println(count +"threadname" +Thread.currentThread().getName());
  }
}


