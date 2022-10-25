package com.zcc.demo.demo2;

public class UnitExercise5_5 {
    public static void main(String[] args) {
        double i = 1;

        double sum = 0;
        for(;i <= 100;i++){
            double j = i;
            if(i % 2 == 0)
                j *= -1;
            sum += 1/j;
        }
        System.out.println(sum);
    }
}
