package com.zcc.demo.demo2.exercise.demo;

public class D {
    private  int count = 9;
    public static void main(String args[]) {
        new D().count();//9
        new D().count();//10
        System.out.println();//11
    }
    public void count() {
        System.out.println("count=" + (count++));
    }
}
