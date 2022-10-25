package com.zcc.demo.demo2;

public class BubbleSort {
    public static void main(String[] args) {
    int[] arr = {81,27,53,64,15};
    int temp = 0;
    //进行冒泡排序
    for(int i = 0;i < arr.length - 1;i++){
        for(int j = 0;j < arr.length - 1 - i;j++){
            if(arr[j] > arr[j + 1] ){
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
            //每排序一次输出一次
            System.out.println("第" + (i+1) + "轮");
            for(int k = 0;k < arr.length;k++){
                System.out.print(arr[k] + " ");
                }
            System.out.println();
        }
    }
}
