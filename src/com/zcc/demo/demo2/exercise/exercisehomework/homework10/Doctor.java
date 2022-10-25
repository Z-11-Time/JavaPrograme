package com.zcc.demo.demo2.exercise.exercisehomework.homework10;

public class Doctor extends Object {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double salary;

    public Doctor(String name, int age, String job, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Doctor)) {
            return false;
        }
        Doctor doctor = (Doctor) obj;
        return this.age == doctor.age && this.name.equals(doctor.name) && this.gender == doctor.gender&&
                this.salary == doctor.salary && this.job.equals(doctor.job);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getJob() {
        return job;
    }

    public double getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }
}
