package com.ques.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentModificationMap {

  public static void main(String[] args) {
    Map<String, Integer> user = new HashMap<String, Integer>();
    user.put("user1", 7);
    user.put("user2", 7);
    user.put("user3", 7);
    user.put("user4", 7);
    user.put("user5", 7);
    user.put("user6", 7);   
    Iterator<String> it = user.keySet().iterator();
    while(it.hasNext()) {
      System.out.println(user.get(it.next()));
      user.put("user7", 7);
    }
  }

}
