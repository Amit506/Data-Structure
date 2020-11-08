package com.datastructure;

public class AnagramRec{
    private int size;
    private char[] arrChar;
   public void doAnagram(char[] array){
      this.size  = array.length;
      this.arrChar = array;

      doAna(size);
   }
   public void doAna(int newSize){
       if (newSize==1)
           return;
       for (int i=0;i<newSize;i++){
           doAna(newSize-1);
           if (newSize==2)
               display();
           rotate(newSize);
       }
       }
       public void rotate (int newSize){
       int j;
       int position= size-newSize;
       char temp= arrChar[position];
       for (j=position+1;j<size;j++){
           arrChar[j-1]=arrChar[j];
           arrChar[j-1]=temp;
       }
       }
       public void display(){
       for (int i=0;i<size;i++){
           System.out.print(arrChar[i]);

       }
       }
   }
