package com.datastructure;

public class PriortyQueue {
    private int size;
    private int[] array;
    private int nItems;
    public PriortyQueue(int s ){
        size=s;
        array =new int[size];
        nItems=0;
    }
    public void insert(int value){
        int j;
        if (nItems==0){
            array[nItems]=value;
        }
        else {
            for (j=nItems-1;j>=0;j--){
                if (value>array[j]){
                    array[j+1]=array[j];
                }
                else
                    break;
            }
            array[j+1]=value;

        }
        nItems++;

    }
    public int remove(){
        return array[--nItems];
    }
    public boolean empty(){
        return nItems==0;
    }
    public boolean full(){
        return nItems==size;
    }
    public void  display(int value){
        System.out.println(value);
    }
}
