package com.datastructure;

public class ShellShort {
    private int[] array;
    private int size;

    public ShellShort(int [] array){
        this.array=array;
        size=array.length;
    }
    public void sort(){
       int i,j;
        for (int h=size/2;h>=1;h=h/2){
            for (i=h;i<size;i++){
                for (j=i-h;j>=0;j=j-h){
                    if (array[j+h]<array[j]){
                        int temp= array[j];
                        array[j]=array[j+h];
                        array[j+h]=temp;

                    }
                }
            }
        }
       }

    public void display(){
        for (int i=0;i<size;i++){
            System.out.println(array[i]);
        }
    }

}
