package com.zcc.demo.demo2;

public class BreakExercise {
    public static void main(String[] args) {
        int size = 100;//定义大小;
        int sum = 0;
        int i = 1;
        for(;i <= size;i++){
            sum += i;
            if (sum > 20){
                System.out.println(sum);
                break;
            }
        }    System.out.println("当前数为" + i);
    }


}
