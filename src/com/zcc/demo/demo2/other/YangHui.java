package com.zcc.demo.demo2;
import java.util.Scanner;
public class YangHui {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("你要的杨辉三角的层数：");
        int num = input.nextInt();
        int[][] arr = new int[num][];
        for(int i = 0;i < arr.length;i++){
            arr[i] = new int[i+1];//开辟一维数组的空间且定义其长度
            //杨辉三角的层数
            for(int j = 0;j < arr[i].length;j++){
                //开头和结尾为1
                if(j == 0||j == arr[i].length - 1){
                    arr[i][j] = 1;
                }
                //其他数为杨辉算法的
                else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        for(int k = 0;k < arr.length;k++) {
            for (int y = 0; y < arr[k].length; y++)
                System.out.print(arr[k][y] + " ");
            System.out.println();
        }
    }
}
