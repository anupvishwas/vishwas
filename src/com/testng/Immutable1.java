package com.testng;

public class Immutable1 {

  public static void main(String[] args) throws CloneNotSupportedException {
    Age age = new Age();
    age.setYear(1992);
    
    StringBuffer sb = new StringBuffer();
    sb.append("anup");
    
    ImmutableStudent im = new ImmutableStudent(1, "anup", age, sb);
    System.out.println("id: "+im.getId()+", name: "+im.getName()+ ", age: " +im.getAge().getYear()+ "Sb: " +sb); 
    age.setYear(1993);
    sb.append("append");
    //im.getAge().setYear(1993);
    System.out.println("id: "+im.getId()+", name: "+im.getName()+ ", age: " +im.getAge().getYear()+ "Sb: " +sb); 
  }
}

final class ImmutableStudent {
  private final int id;
  private final String name;
  private final Age age;
  //StringBuffer sb = new StringBuffer();
  public ImmutableStudent(int id, String name, Age age, StringBuffer sb) {
    this.id = id;
    this.name = name;
    Age cloneAge = new Age(); // use clone object to return constructor
    cloneAge.setYear(age.getYear());
    this.age = cloneAge;
  }
  
  public int getId() {
    return id;
  }
  public String getName() {
    return name;
  }

  public Age getAge() throws CloneNotSupportedException {
//    Age cloneAge = new Age();
//    cloneAge.setYear(this.age.getYear());
    return (Age) age.clone();
  }
}


class Age implements Cloneable {
  private int year;
  
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}



