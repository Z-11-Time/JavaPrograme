package com.zcc.demo.demo2.demo;

/**
 * @author Dr.Z
 * @version demo
 */
public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "名称：" + name + "\t\t\t\t"+
                "年龄：" + age ;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
