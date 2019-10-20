package com.ques.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxParticipant {

  public static void main(String[] args) {
    int[] entry = new int[] {1,3,3,5,7};
    int[] duration = new int[] {2,2,1,2,1};
    List<Performer> festival= program(entry, duration);
    System.out.println("Count (Expected=4): " + festival.size());
    System.out.println("lineup:"+festival);

  }
  
  public static List<Performer> program(int entry[], int[] duration) {
    List<Performer> l = new ArrayList<Performer>();
    
    for (int i=0; i<entry.length; i++) {
      l.add(new Performer(entry[i], duration[i]));
    }
    
    Collections.sort(l, new Comparator<Performer>() {

      @Override
      public int compare(Performer p1, Performer p2) {
        int c = p1.arrival+p1.duration;
        int d = p2.arrival+p2.duration;
        
        return ((Integer)c).compareTo((Integer)d);
      }
      
    });
    
    List<Performer> festival=new ArrayList<Performer>();
    int currentTime = 1;
    for (Performer p:l) {
      if (p.arrival >= currentTime) {
          currentTime = p.arrival+p.duration;
          festival.add(p);
      }
  }
  return festival;
    
  }
  

}



class Performer {
  
  int arrival;
  int duration;
  
  public Performer(int arrival, int duration) {
    this.arrival = arrival;
    this.duration = duration;
  }
}
