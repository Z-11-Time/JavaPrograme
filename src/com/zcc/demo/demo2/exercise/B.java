package com.zcc.demo.demo2.exercise;

public class B {
    public static void main(String[] args) {
        A a = new A(10,10,10,10);
        a.setN4(10);
        int n = a.n3;
    }
}
class C{
    public void say(){
        A a = new A(10,10,10,10);
        System.out.println(a.n1+a.n2+a.n3);
    }
}
