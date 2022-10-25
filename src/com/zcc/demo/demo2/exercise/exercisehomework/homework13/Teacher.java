package com.zcc.demo.demo2.exercise.exercisehomework.homework13;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("I promise I will teach carefuly");
    }
    public void play(){
        System.out.println(this.getName() + "爱玩象棋");
    }

    @Override
    public String toString() {
        return "老师的信息" + "\n" +
                "工作： " + work_age +
                super.toString();
    }
}
