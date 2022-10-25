package com.zcc.demo.demo2.demo;

import java.util.*;

/**
 * @author Dr.Z
 * @version demo
 */
public class MapExercise {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(123,new employee_("asd", 122555, 11));
        hashMap.put(12,new employee_("asd", 1111, 11));
        hashMap.put(124,new employee_("asd", 1111, 11));
        //random的使方法
//        Random random = new Random();
//        random.nextInt(10);
        //第一种遍历，keyset
        Set set = hashMap.keySet();
        for (Object key : set) {
            employee_ employee = (employee_) hashMap.get(key);
            if (employee.getSalary() >= 0)
                System.out.println(key + "-" +hashMap.get(key));
        }
        //第二种遍历，EntrySet
        Set entrySet = hashMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object entry =  iterator.next();
            Map.Entry en = (Map.Entry) entry;
//            System.out.println(en.getValue().getClass());
            employee_ em = (employee_) en.getValue();
            if(((employee_ )en.getValue()).getSalary() > 12000)
                System.out.println(en.getKey() +"-" + en.getValue());
        }
    }
}
class employee_{
    private String name;
    private double salary;
    private int ID;


    public employee_(String name, double salary, int ID) {
        this.name = name;
        this.salary = salary;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", ID=" + ID +
                '}';
    }
}