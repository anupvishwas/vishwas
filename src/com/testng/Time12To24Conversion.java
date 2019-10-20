package com.testng;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time12To24Conversion {

  public static void main(String[] args) {
    
    System.out.println(convertTo24("07:05:45PM"));
    Long l = Long.MAX_VALUE;
    int i = l.intValue();

  }
  
  public static String convertTo24(String s) {

    SimpleDateFormat sf = new SimpleDateFormat("hh:mm:ssa");
    Date d = null;
    try {
      d = sf.parse(s);
    } catch (ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    SimpleDateFormat sf1 = new SimpleDateFormat("HH:mm:ss");
    return sf1.format(d);
  
  }
    
}
