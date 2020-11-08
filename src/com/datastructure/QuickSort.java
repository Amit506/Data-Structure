package com.datastructure;

public class QuickSort {

    public void sort(int [] array,int lb,int ub){
        if (lb<ub){
            int position = partition(array,lb,ub);
            sort(array,lb,position-1);
            sort(array,position+1,ub);
        }

    }
    public int partition(int [] array,int lb,int ub){
       int num = array[ub];
       int smallIndex =lb;
       int current=lb;
        while (current!=ub){
            if (array[current]<num){
                int temp = array[smallIndex];
                array[smallIndex]=array[current];
                array[current]=temp;
                current++;
                smallIndex++;
            }
            else {
                current++;
            }
        }
        int temp = array[smallIndex];
        array[smallIndex]=array[ub];
        array[ub]=temp;
        return smallIndex;
    }
}
