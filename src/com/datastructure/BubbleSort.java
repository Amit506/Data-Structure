package com.datastructure;

import java.util.Scanner;

public class BubbleSort {
    public void display(int [] array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public void sort(int[] array){
        int temp ;
        System.out.println("Bubble sort:");
        for (int i=array.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }
    }

}
