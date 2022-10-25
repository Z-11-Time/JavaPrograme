package com.zcc.demo.demo2;
import java.util.Scanner;
public class ArrayAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = {1,2,3};
        do {
            //元素添加
            System.out.println("要添加的元素：");
            int number = input.nextInt();
            //新建一个比原数组大一位的空数组
            int[] arr2 = new int[arr1.length + 1];
            //导入之前原有的元素到新数组
            for(int i = 0;i < arr1.length;i++){
                arr2[i] = arr1[i];
            }
            //添加新的元素
            arr2[arr2.length - 1] = number;
            //地址拷贝给原数组
            arr1 = arr2;
            //判断是否继续添加
            System.out.println("是否继续添加；");
            char what = input.next().charAt(0);
            if(what == 'n'){
                break;
            }
            //输出arr1
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr1[i]);
            }
            System.out.println();
        }while (true);
    }
}
