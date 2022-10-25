package com.zcc.demo.demo2.exercise.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Dr.Z
 * @version demo
 */
@SuppressWarnings({"all"})
public class GenericExercise {
    public static void main(String[] args) {
        Employee e1 = new Employee("jack", 2000, new Employee().getMyDate(12, 20, 2012));
        Employee e2 = new Employee("jack", 200, new Employee().getMyDate(12, 20, 2022));
        Employee e3 = new Employee("jack", 2000, new Employee().getMyDate(12, 15, 2022));
        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName() != o2.getName())
                    return o1.getName().compareTo(o2.getName());
                else if (o1.getBirthday().getYear() != o2.getBirthday().getYear())
                    return o1.getBirthday().getYear() - o2.getBirthday().getYear();
                else if (o1.getBirthday().getMonth() != o2.getBirthday().getMonth())
                    return o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                else
                    return o1.getBirthday().getDay() - o2.getBirthday().getDay();
            }
        });
        for (Employee e:list ){
            System.out.println(e);
        }
    }
}

@SuppressWarnings({"all"})
class Employee {
    private String name;
    private int Salary;
    private MyDate birthday;

    public class MyDate {
        private int month;
        private int day;
        private int year;

        @Override
        public String toString() {
            return "MyDate{" +
                    "month=" + month +
                    ", day=" + day +
                    ", year=" + year +
                    '}';
        }

        public MyDate(int month, int day, int year) {
            this.month = month;
            this.day = day;
            this.year = year;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getMonth() {
            return month;
        }

        public int getDay() {
            return day;
        }

        public int getYear() {
            return year;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                ", birthday=" + birthday +
                '}';
    }

    public Employee() {
    }

    public MyDate getMyDate(int month, int day, int year) {
        return new MyDate(month, day, year);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return Salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public Employee(String name, int salary, MyDate birthday) {
        this.name = name;
        Salary = salary;
        this.birthday = birthday;
    }
}