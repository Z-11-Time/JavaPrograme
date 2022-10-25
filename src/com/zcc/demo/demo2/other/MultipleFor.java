package com.zcc.demo.demo2;

public class MultipleFor {
    public static void main(String[] args) {
        int point = 1;
        int level = 6;
        for (int i = 1;i <= level;i++){
            //i 是层数
            int blank = level - i;
            //金字塔前面的空格
            while(blank > 0){
                System.out.print(" ");
                blank--;
            }
            //金字塔实体
            for(int j = 1; j <= point;j++) {
                if (j == 1 || j == point || i == level)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            //打完一行换个行
            System.out.println("");
            point += 2;
        }
    }
}
