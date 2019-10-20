package com.ques.array;



public class SwapSortArray {
  public static void main(String[] args) {
    int[] a= new int[]{7,1,3,2,4,5,6};
    System.out.println(swapArr(a));
    
  }
  
  public static int swapArr(int[] a) {
    int swap=0;
    for(int i=0;i<a.length;i++){
        if(i+1!=a[i]){
            int t=i;
            while(a[t]!=i+1){
                t++;  
            }
            int temp=a[t];
            a[t]=a[i];
            a[i]=temp;
            swap++;
        }
    }
    return swap;
  } 

}

//
//i   arr                     swap (indices)
//0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
//1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
//2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
//3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
//4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
//5   [1, 2, 3, 4, 5, 6, 7]

// It took 5 swaps to sort the array.    