package com.abc;

public class GenerateBill {

  public static void main(String[] args) {
    GetPlanFactory planFactory = new GetPlanFactory();
    Plan p = planFactory.getPlan("NATIONALPLAN");
    p.getRate();
    System.out.println(p.calculateBill(2));
  }
}
