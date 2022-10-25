package com.zcc.demo.demo2;
import java.util.Scanner;
public class RecursionExercise01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第几天：");
        int in = input.nextInt();
        Tools t = new Tools();
        Tools2 t2 = new Tools2();
        //System.out.println(t.fbnc(7));
        System.out.println(t2.peach(in));
    }
}
class Tools{
    public int fbnc(int n){
        if(n <= 2)
            return 1;
        else{
            return fbnc(n - 1) + fbnc(n - 2);
        }
    }
}
class Tools2{
    public int peach(int n){
        if(n == 10)
            return  1;
        else{
            return (peach(n + 1) + 1) * 2;
        }
    }
}