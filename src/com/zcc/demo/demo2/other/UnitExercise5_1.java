package com.zcc.demo.demo2;
import java.util.Scanner;
public class UnitExercise5_1 {
    public static void main(String[] args){
        System.out.println("输入金额:");
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble()
                ;
        int count = 0;
        while(money >= 1000){
            if(money > 50000){
                money *= 0.95;
                count ++;
            }
            else if(money >= 1000){
                money -= 1000;
                count++;
            }
//            else
//                break;
        }
        System.out.println(count);
    }
}
