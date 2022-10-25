package com.zcc.demo.demo2.exercise;

public class A {
    public int n1 = 100;
    protected int n2 = 100;
    int n3 = 100;
    private int n4 = 100;

    public A(int n1, int n2, int n3, int n4) {
        this.setN1(n1);
        this.setN2(n2);
        this.setN3(n3);
        this.setN4(n4);
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    public void setN4(int n4) {
        this.n4 = n4;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public int getN3() {
        return n3;
    }

    public int getN4() {
        return n4;
    }
}

