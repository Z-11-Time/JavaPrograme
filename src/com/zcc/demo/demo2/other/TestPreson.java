package com.zcc.demo.demo2;

public class TestPreson {
    public static void main(String[] args) {
        Person p1 = new Person("lihua",10);
        Person p2 = new Person("LILEI",10);
        Person p3 = new Person("lihua",10);
        System.out.println(p1.compareTo(p3));
    }
}
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public boolean compareTo(Person p){
        if(this.name.equals(p.name)&&this.age == p.age)
            return true;
        else
            return false;
    }
}