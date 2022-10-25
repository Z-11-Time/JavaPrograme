package com.zcc.demo.demo2.demo;

public class Test_02 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Innter innter = new Outer().new Innter();//第一种方法，直接建立
        Outer.Innter innter1 = outer.get();//第二种方法，通过外部类编写的方法返回对象
        innter.say();
    }
}

class Outer {
    private int n = 10;
    public String name = "王五";
    class Innter{
        public void  say(){
            System.out.println(name + n);
        } 
    }
    public Innter get(){
        return new Innter();
    }
}