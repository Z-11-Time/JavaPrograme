package com.zcc.demo.demo2.exercise.exercisehomework.homework13;

public class Student extends Person{
    private int syu_id;

    public Student(String name, char sex, int age, int syu_id) {
        super(name, sex, age);
        this.syu_id = syu_id;
    }
    public void study(){
        System.out.println("I promise,I will study hardly");
    }
    public void play(){
        System.out.println(this.getName() + "爱玩足球");
    }

    @Override
    public String toString() {
        return "学生信息：" + "\n" +
                "学号： " + syu_id +
                super.toString() ;
    }

    public int getSyu_id() {
        return syu_id;
    }
}
