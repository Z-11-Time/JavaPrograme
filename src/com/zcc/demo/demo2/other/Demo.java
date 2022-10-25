package com.zcc.demo.demo2;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {10,-5,88};
        Arrays.sort(arr);

        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
//        int temp = 0;
//        for(int i = 0;i < arr.length - 1;i++){
//            for(int j = 0;j < arr.length - i -1;j++){
//                if(arr[j] > arr[j + 1]){
//                    temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for(int j = 0;j < arr.length;j++){
//            System.out.print(arr[j] + " ");
//        }
//        TT tt = new TT();TT
    }

}
class TT{
    int age;

    public TT() {

    }
}
