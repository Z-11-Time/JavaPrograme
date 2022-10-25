package com.zcc.demo.demo2.exercise.computer;

public class Pc extends Computer {
    private String brand;
    public int m = memory;
    public Pc(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }
    public void method(){
        getDetails();
        System.out.println();
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void printInfo() {
        System.out.println(getDetails() + " " + brand);
    }
}