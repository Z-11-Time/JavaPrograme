package com.zcc.demo.demo2.demo;

import java.util.*;

/**
 * @author Dr.Z
 * @version demo
 */
public class GenericExercise {
    public static void main(String[] args) {
        Student student = new Student("11", 11);
        Student student1 = new Student("122", 21);
        Student student2 = new Student("12", 12);
        HashMap<String,Student> set = new HashMap<>();//K,V都有参数类型
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();//K,V参数默认为Object
        set.put(student.name,student);
        set.put(student1.name,student1);
        set.put(student2.name,student1);
        int n = 20;
        Integer integer = Integer.valueOf(n);
        int a = integer;
        Set<Map.Entry<String, Student>> entries = set.entrySet();//K,V都有参数类型
        Set<Map.Entry<Object, Object>> entries1 = objectObjectHashMap.entrySet();
        Iterator<Map.Entry<Object, Object>> iterator1 = entries1.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Object, Object> next =  iterator1.next();
        }
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> key =  iterator.next();
            System.out.println(key.getKey() + key.getValue());
        }
    }
}

class Student {
    public String name;
    public int aeg;

    public Student(String name, int aeg) {
        this.name = name;
        this.aeg = aeg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", aeg=" + aeg +
                '}';
    }
}