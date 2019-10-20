package com.abc;

public abstract class  Plan {
  
  protected int rate;
  abstract void getRate();
  
  public int calculateBill(int units) {
    return rate*units;
  }
}
