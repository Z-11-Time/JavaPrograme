package com.zcc.demo.demo2.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author Dr.Z
 * @version demo
 */
public class HashSetExercise_02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        //创建含有成员 内部类的对象
        hashSet.add(new Employee_02("11",20000,new Employee_02().get(2022,12,5)));
        hashSet.add(new Employee_02("11",20000,new Employee_02().get(2022,12,5)));
//        System.out.println(hashSet);
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
class Employee_02{
    private String name;
    private double sal;
    private MyDate birthday;
    private class MyDate{
        public int year;
        public int month;
        public int day;
        //重写了hash和equals
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyDate myDate = (MyDate) o;
            return year == myDate.year && month == myDate.month && day == myDate.day;
        }

        @Override
        public int hashCode() {
            return Objects.hash(year, month, day);
        }

        @Override
        public String toString() {
            return "MyDate{" +
                    "year=" + year +
                    ", month=" + month +
                    ", day=" + day +
                    '}';
        }

        public  MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;

        }
    }
    public MyDate get(int year, int month, int day){
        return new MyDate(year,month,day);
    }
    //重写hash和equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee_02 that = (Employee_02) o;
        return Double.compare(that.sal, sal) == 0 && Objects.equals(name, that.name) && Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sal, birthday);
    }

    //有参构造器
    public Employee_02(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }
    //无参构造器
    public Employee_02() {
    }

    @Override
    public String toString() {
        return "Employee_02{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
