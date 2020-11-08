package com.datastructure;

public class Stack {
    private int size;
    private int[] array;
    private int top;
    public Stack(int s){
        size=s;
        array = new int[size];
        top=-1;
    }
    public void push(int value){

        array[++top]=value;
    }
    public int  pop(){
        return array[top--];
    }
    public  int peek(){
        return array[top];
    }
    public boolean empty(){
        return (top==-1);
    }
    public boolean full(){
        return (top==size-1);
    }
    public void display(int value){
        System.out.println(value);
    }

}
