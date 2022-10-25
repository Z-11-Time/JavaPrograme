package com.zcc.demo.demo2.exercise.object_;

public class MainRun {
    public static void main(String[] args) {
        Son son = new Son(10);
        Dad dad = new Dad(20);
        String n = "110";
        Wife wife = new Wife();
        son.Math_();
        System.out.println(son.Math_());
        MainRun mainRun = new MainRun();
        mainRun.show(son);
        System.out.println(dad.n.equals("d"));
        System.out.println(dad);
    }
    public void show(Dad dad){
        System.out.println(99);
    }

}
