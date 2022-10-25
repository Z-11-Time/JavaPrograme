package com.zcc.demo.demo2.exercise.exercisehomework.demo;

abstract public class Empoloyee {
    private String name;
    private int id;
    private double salary;

    public Empoloyee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void work();
}
class Manager extends Empoloyee{
    private double bonus;

    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中");
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
}
interface IB{
    Void HI();
}