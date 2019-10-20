package com.testng;

public class SequentialThread {

  public static void main(String[] args) {
    // Count c = new Count();
    Thread t1 = new Count("one");
    Thread t2 = new Count("two");
    Thread t3 = new Count("three");
    Thread t4 = new Count("four");
    Thread t5 = new Count("five");
    
    t1.run();
    t2.run();
    t3.run();
    t4.run();
    t5.run();
    
  }

}

class Count extends Thread {
  ResourceLock lock;

  Count(ResourceLock lock){
      this.lock = lock;
  }

  @Override
  public void run() {

      try{
          synchronized (lock) {

              for (int i = 0; i < 100; i++) {

                  while(lock.flag!=3){
                      lock.wait();
                  }

                  System.out.print(Thread.currentThread().getName());
                  Thread.sleep(1000);
                  lock.flag = 1;
                  lock.notifyAll();
              }

          }
      }catch (Exception e) {
          System.out.println("Exception 3 :"+e.getMessage());
      }

  }
  
}



class ResourceLock{
  public volatile int flag = 1;
}