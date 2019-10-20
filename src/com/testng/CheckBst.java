package com.testng;

import javax.xml.soap.Node;



public class CheckBst {

  public static void main(String[] args) {
    

  }
  
  public static boolean isBst(Node node,int min, int max) {
    
    if (node == null) 
      return true;
    
    if (node.data < min || node.data > max) {
      return false;
    }
    
     
  }

}
