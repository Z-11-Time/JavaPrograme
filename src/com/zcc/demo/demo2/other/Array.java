package com.zcc.demo.demo2;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a = {11,12,13,14};
        int temp = 0;
        int i = 0;
        int j = 0;
        for (;i < a.length;i++){
             j = a.length - i - 1;
            if(i <= j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        Arrays.sort(a);
         for(i = 0;i < a.length;i++)
            System.out.print(a[i] + " ");
    }
}
