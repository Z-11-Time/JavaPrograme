package com.zcc.demo.demo2;
import java.util.Scanner;
public class IfExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入年份");
        int year = input.nextInt();
        if( (year % 4 == 0 && year % 100 != 0)||(year % 400 == 0 )){
            System.out.println("是闰年");
        }else
            System.out.println("不是闰年");
    }
}
