package com.datastructure;

public class RadixSort {
 int[] tempArray;
public void  radixSort(int [] array,int max){

for (int i=1;max/i>0;i=i*10){
    countSort(array,max,i);
}

}
    public void countSort(int [] array,int max,int p){
        int [] count= new int[max+1];
         tempArray = new int[array.length];

        for (int i=0;i<array.length;i++){
            ++count[(array[i]/p)%10];
        }
        for (int i=1;i<=max;i++){
            count[i]=count[i]+count[i-1];
        }
        for (int i=array.length-1;i>=0;i--){
            tempArray[--count[(array[i]/p)%10]]= array[i];
        }
        for (int i=0;i<array.length;i++){
            array[i]=tempArray[i];
        }


    }

}
