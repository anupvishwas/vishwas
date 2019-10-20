package com.abc;

import java.io.IOException;

public class Casting {

  public static void main(String[] args) throws Exception {
//    Bmw b = (Bmw) new Car(); //Java lang class cast exception, com.factory.pattern.Car cannot be cast to com.factory.pattern.Bmw
//    b.getBmwCar();
//    b.getCar();
//    b.show();
//    System.out.println("====================");
    
    Car c = new Bmw(); //only parent class method visibility availability
    c.getCar();
    c.show();
    System.out.println("=======only parent class data members ==========");
    
    
    Bmw b1 = (Bmw) c; //both class method visibility availability including override
    b1.getBmwCar();
    b1.getCar();
    b1.show();
  }

}

class Car {
  
  protected void show() throws Exception {
    System.out.println("Show car");
  }
  
  public void getCar() {
    System.out.println("get car");
  }
}

class Bmw extends Car {
  
  @Override
  public void show() throws IOException {
    System.out.println("Show Bmw");
  }
  
  public void getBmwCar() {
    System.out.println("get Bmw");
  }

}
