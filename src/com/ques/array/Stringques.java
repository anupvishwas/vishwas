package com.ques.array;

public class Stringques {

  public static void main(String[] args) {
    Stringques s = new abc();
    System.out.println(s.disp("priyanka"));

  }
  public String disp(String t) {
    return "hi "+t;
  }

}



class abc extends Stringques {
  public String disp(String t) {
    return "hello "+t;
  }
}
