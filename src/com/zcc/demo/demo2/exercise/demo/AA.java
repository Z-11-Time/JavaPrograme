package com.zcc.demo.demo2.exercise.demo;

public class AA{
    public static void main(String[] args) {
        BB bb = new BB();
    }
}
class AAA {
    {
        System.out.println("normal codeBlock");
    }

    public AAA() {
    }
    public AAA(int n) {
    }


    {
        System.out.println("printout AAA");
    }
}
class BB extends AAA{
    {
        System.out.println("printout BB");
    }
}

