package com.zcc.demo.demo2.exercise.exercisehomework.homework13;

public class Person {
    private String name;
    private char sex;
    private int age;
    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public void play(){

    }


    @Override
    public String toString() {
        return "姓名: " + this.getName() + "\n" +
                "性别: " + this.getSex() + "\n" +
                "年龄： " + this.getAge() + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
