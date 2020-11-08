package com.datastructure;
//It is selection sort faster than bubble sort but having same complexity[O(n^2)] due to less number of swaps.
public class InsertionSort {
    public void display(int [] array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

   public void sort(int[] array) {
       System.out.println("Sorted using Insertion sort:");

      for (int i=0;i<array.length-1;i++){
        int  min=i;
          for (int j=i+1;j<array.length;j++){
              if (array[j]<array[min]){
                  min=j;
              }
          }
          int temp = array[i];
          array[i]=array[min];
          array[min]=temp;
      }

       }
   }

