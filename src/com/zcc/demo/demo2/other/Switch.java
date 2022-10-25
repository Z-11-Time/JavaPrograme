package com.zcc.demo.demo2;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        char input = myScanner.next().charAt(0);
        switch (input){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
            case 'c':
                System.out.println("星期三");
            case 'd':
                System.out.println("星期四");
            case 'e':
                System.out.println("星期五");
            case 'f':
                System.out.println("星期六");
            case 'g'+1:
                System.out.println("星期日");
        }
    }
}
