package com.zcc.demo.demo2;
import java.util.Scanner;
public class IfElse {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("当前是旺季还是淡季");
        String season = myScanner.next();
        System.out.println("游客的年龄");
        int age = myScanner.nextInt();
        int sal = 0;
        if (season.equals("旺季")){
            if(age >= 18 && age < 60){
                sal = 60;
            }else if(age < 18){
                sal = 30;
            }else sal = 20;
        }else if(season.equals("淡季")){
            if(age >= 18 && age < 60){
                sal = 40;
            }else sal = 20;
        }
        System.out.println(sal);
    }
}
