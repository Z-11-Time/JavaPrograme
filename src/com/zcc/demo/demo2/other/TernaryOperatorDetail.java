package com.zcc.demo.demo2;
//三元运算符
//实现三个数的最大值
public class TernaryOperatorDetail {
    public static void main(String[] args) {
        int a = 553;
        int b = 33;
        int c = 123;
        double max1 = a > b ? a : b;
        double max = max1 > c ? max1 : c;
        System.out.println(max);
    }
}
