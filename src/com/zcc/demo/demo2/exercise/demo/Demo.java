package com.zcc.demo.demo2.exercise.demo;

public class Demo {
    private int n;

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.n = 0;
        demo.sum2(10);
    }
    static int fee;
    public static void sum(int fee){//静态
        Demo demo = new Demo();
        demo.sum2(10);//非静态
        demo.n = 0;
        Demo.fee += fee;
        System.out.println(Demo.fee);
    }
    public void sum2(int fee){
        Demo.fee += fee;
        System.out.   println(Demo.fee);
    }
    public static void sum3(int fee){
        Demo.fee += fee;
        System.out.println(Demo.fee);
    }
}