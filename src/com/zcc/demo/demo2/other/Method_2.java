package com.zcc.demo.demo2.other;

public class Method_2 {
    public static void main(String[] args) {
        Object p = new Object();
        MyTools tools = new MyTools();
        p.age = 10;
        Object2 p2 = tools.CopyObject(p);
        System.out.println(p2.age);
    }
}
class  Object{
    int age;
}
class Object2{
    int age;
}
class MyTools{
    public Object2 CopyObject(Object p){
        Object2 p2 =new Object2();
        p2.age = p.age;
        return p2;
    }
}