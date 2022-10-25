package com.zcc.demo.demo2.exercise.exercisehomework.homework03;

public class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;

    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }

    public void introduce(){
        System.out.println(this.age+this.salary+this.post+ this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
