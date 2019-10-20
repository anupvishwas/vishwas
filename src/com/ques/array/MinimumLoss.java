package com.ques.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumLoss {

  public static void main(String[] args) {
    
    long[] l = new long[]{20,7,8,2,5};
    System.out.println(minLoss(l));
    

  }
  
  public static int minLoss(long[] price) {
    
    Map<Long, Integer> m = new HashMap<Long, Integer>();
    for (int i=0; i<price.length; i++) {
      m.put(price[i], i);
    }
    Arrays.sort(price);
    Long minLoss = Long.MAX_VALUE;
    for (int i=price.length-1; i>0; i--) {
      if ((price[i] - price[i-1]) < minLoss) {
        if (m.get(price[i]) < m.get(price[i-1])) {
          minLoss = price[i] - price[i-1];
        }
      }
    }
    return minLoss.intValue();
  }

}


//Sample Ip:
//  5 10 3 => 2
//  20 7 8 2 5 => 2
  