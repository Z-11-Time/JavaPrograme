package com.zcc.demo.demo2;
import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        Count c = new Count();
        System.out.println(c.change(a));
        int b = c.method(3);
        int d = c.getSum(5,6);
        c.print(5,5,'5');
        do {
            if (c.judge(input.nextInt()))
                System.out.println("是奇数");
            else
                System.out.println("是偶数");
        }while (true);
    }
}
class Count{
    public int method(int n){
        int num = 0;
        for(int i = 1;i <= n;i++){
            num += i;
        }
        return num;
    }
    public int getSum(int num1,int num2){
        int sum = num1 + num2;
        return sum;
    }
    public boolean judge(int n){
        return n % 2 != 0;
    }
    public void print(int cow ,int col,char in){
        for(int i = 0;i < cow;i++){
            for(int j = 0;j < col;j++){
                System.out.print(in);
            }
            System.out.println();
        }
    }
    public int change(int n){
        return n = 10;
    }
}
