package com.zcc.demo.demo2.demo;
public class Computer {
    public static void main(String[] args) {
        //需求：定义一个能实现Computer接口的方法
        //实现：创建匿名方法，调用匿名方法
        new Cellphone().testWork(new Computer1() {
            @Override
            public double work(double n1, double n2) {
                return n1+n2;
            }
        },8,10);
    }
}
//定义接口
interface Computer1{
    public double work(double n1,double n2);
}
//方法的创建
class Cellphone{
    public void testWork(Computer1 computer1,double n1,double n2){
        double result = computer1.work(n1,n2);
        System.out.println(result);
    }
}
