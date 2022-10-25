package com.zcc.demo.demo2;

public class WhileExercise {
    public static void main(String[] args) {
        int i = 0;
        int size = 100;
        while (i <= size){
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
