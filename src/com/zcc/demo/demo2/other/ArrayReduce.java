package com.zcc.demo.demo2;
import java.util.Scanner;
public class ArrayReduce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = {1,2,3,4,5};
        do {//新建一个缩减过的数组
            int[] arr2 = new int[arr1.length - 1];
            //把值赋给缩减的数组
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = arr1[i];
            }
            //地址拷贝给原数组
            arr1 = arr2;
            //输出缩减过的原数组
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr1[i] + " ");
            }
            //判断是否继续缩减
            System.out.println("是否继续缩减:");
            char what = input.next().charAt(0);
            if(what == 'n'){
                System.out.println("停止缩减");
                break;
            }
            else if(arr1.length == 1) {
                System.out.println("抱歉，已经只剩最后一个元素了，不能再缩减了");
                break;
            }
        }while (true);
    }
}
