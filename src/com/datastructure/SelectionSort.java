package com.datastructure;
//It is insertion sort twice faster than bubble and also faster then selection sort but it also has same complexity[O(n^2)].

public class SelectionSort {
    public void display(int [] array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public  void sort(int array[]){
        System.out.println("Sorted using Insertion Sort:");
        for (int i=1;i<array.length;i++){
            int temp= array[i];
            int j = i-1;
            while (j>=0&&array[j]>temp){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=temp;
        }
    }
}

