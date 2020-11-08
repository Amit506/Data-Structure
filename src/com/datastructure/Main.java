package com.datastructure;


import java.util.*;

public class Main{

        public static void main(String[] args) {
                int[] array = {86 , 654, 41, 554, 298, 80, 131, 97, 711, 943, 139, 101, 61, 401};
                int max =943;
   RadixSort r = new RadixSort();
   r.radixSort(array,max);

                for (int a : array) {
                        System.out.println(a);
                }
        }
}
