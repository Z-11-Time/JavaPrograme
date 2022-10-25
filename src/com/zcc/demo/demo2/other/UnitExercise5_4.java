package com.zcc.demo.demo2;

public class UnitExercise5_4 {
    public static void main(String[] args) {
        int i = 1;
        int sum1 = 0;
        int sum2 = 0;
        for(;i <= 100;i++){
            sum1 += i;
            sum2 += sum1;
        }
        System.out.println(sum2);
    }
}
