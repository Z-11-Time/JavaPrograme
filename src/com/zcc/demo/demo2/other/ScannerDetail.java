package com.zcc.demo.demo2;
import java.util.Scanner;//引入Scanner类所在的包
public class ScannerDetail {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//用new创建一个新对象
        System.out.println("请输入姓名：");
        String name = myScanner.next();
        System.out.println("请输入年龄：");
        int age = myScanner.nextInt();
        if (age >= 18){
            System.out.println("对不起，你已经大于18了，要入监狱");
        }else{
            System.out.println("你小于18，这次放过你了");
        }
        System.out.println("请输入薪资：");
        double sal = myScanner.nextDouble();

    }
}
