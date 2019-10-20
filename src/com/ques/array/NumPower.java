package com.ques.array;

public class NumPower {

  public static void main(String[] args) {
    System.out.println(raiseToPower(2,4));
  }
  
  public static int raiseToPower(int num, int pow) {
    System.out.println("num is:" +num+ "power is:" +pow);
    int result = num*num;
    System.out.println("result is:" +result);
    if (pow>0)
      return raiseToPower(result, pow-1);
    else return 1;
  }

}
