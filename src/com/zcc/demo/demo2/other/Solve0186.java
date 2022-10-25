package com.zcc.demo.demo2;
public class Solve0186 {
    public static void main(String[] args) {
        int[] arr = {10,12,45,90};
        int[] arr2 = new int[arr.length + 1];
        int input = 23;
        int index = 0;
        //取比input小的最后一个数后一位的下标
        for(int i = 0;i < arr.length;i++) {
            if(input > arr[i]){
                index = i + 1;
            }
        }
        //进行替换
        for(int j = 0;j < arr2.length;j++) {
            if (j == index)
                arr2[j] = input;
            //大于的都往后挪一位
            else if(j > index){
                arr2[j] = arr[j - 1];
            }
            else
                arr2[j] = arr[j];
        }
        arr = arr2;
        for(int j = 0;j < arr.length;j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
