package com.zcc.demo.demo2;
import java.util.Scanner;

public class UnitExercise5_2 {
    public static void main(String[] args){
        System.out.println("输入数:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        for (int i = 1;i <= number;i++){
            if(i % 5!= 0){
                System.out.print(i + "\t");
                count++;
                if(count % 5 == 0)
                    System.out.println();
            }

        }
    }
}
