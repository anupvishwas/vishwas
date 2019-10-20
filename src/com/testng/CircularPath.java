package com.testng;

public class CircularPath {

  public static void main(String[] args) {
    String str = "GLGLGLG"; 
    System.out.println(isCircular(str.toCharArray()));

  }
  
  public static boolean isCircular(char[] ch) {
    int x = 0;
    int y = 0;
    int dir = 0;
    for (int i=0; i<ch.length; i++) {
      char move = ch[i];
      
      if (move == 'R') {
        dir = (dir+1)%4;
      } else if (move == 'L') {
        dir = (4+dir-1)%4;
      } else {
        if (dir == 0) {
          y++;
        } else if (dir == 1) {
          x++;
        } else if (dir == 2) {
          y--;
        } else if (dir == 3) {
          x--;
        }
      }
    }
    return (x == 0 && y== 0);
  }

}
