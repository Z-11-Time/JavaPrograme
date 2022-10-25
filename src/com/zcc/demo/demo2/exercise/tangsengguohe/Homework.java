package com.zcc.demo.demo2.exercise.tangsengguohe;

/**
 * @author Dr.Z
 * @version demo
 */
public class Homework {
    public static void main(String[] args) {
        Person person = new Person("唐僧",new Horse());
        person.normal();//一般情况
        person.passRiver();//过河
    }
}