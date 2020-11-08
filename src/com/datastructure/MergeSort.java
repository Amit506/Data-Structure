package com.datastructure;
public class MergeSort {
    private  int[] array;
    private int  [] tempArray;
    private int size;
    public void sort(int[] array){
        this.array=array;
        this.size=array.length;
        this.tempArray = new int[size];
        merge_sort(0,size-1);
    }
    public  void merge_sort (int lb,int ub){
        if (lb<ub){
            int mid =(lb+ub)/2;
            merge_sort(lb,mid);
            merge_sort(mid+1,ub);
            merge(lb,mid,ub);

        }
    }
    public void merge(int lb,int mid,int ub){
        for (int i=0;i<=ub;i++){
            tempArray[i]=array[i];
        }
        int i=lb;
        int j =mid+1;
        int k=lb;
        while (i<=mid&&j<=ub){
            if (tempArray[i]<=tempArray[j]){
                array[k]=tempArray[i++];

            }
            else {
                array[k]=tempArray[j++];

            }
            k++;
        }
        if(i>mid) {
            while (j<= ub) {
                array[k++] = tempArray[j++];
            }
        }
        else {
            while (i<=mid){
                array[k++]=tempArray[i++];
            }
        }
    }

}