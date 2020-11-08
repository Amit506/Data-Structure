package com.datastructure;

public class Queue {
    private int size;
    private int[] array;
    private int front ;
    private int rear;
    private int nItems;
    public Queue(int s){
        size=s;
        array= new int[size];
        front=0;
        rear=-1;
        nItems=0;
    }
    public  void insert(int value){
        if (rear==size-1)
            rear=-1;
        array[++rear]=value;
        nItems++;
    }
    public int remove(){
        int temp = array[front++];
        if (front==size)
            front=0;
        nItems--;
        return temp;
    }
    public int peek(){
        return array[front];
    }
    public boolean empty(){
        return (nItems==0);
    }
    public boolean full(){
 return (nItems==size);
    }
    public int size(){
        System.out.println(nItems);
        return nItems;

    }
    public void display(int value){
        System.out.println(value);
    }

}
