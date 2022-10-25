package com.zcc.demo.demo2.exercise.computer;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        Pc pc = new Pc("intel",10,500,"ibm");
        pc.printInfo();
        Computer computer = new Computer("intel",10,500);
        pc.getDetails();
    }
}
