package com.zcc.demo.demo2.exercise.thread;

import java.util.Scanner;

/**
 * @author Dr.Z
 * @version demo
 */

/*
* 需求
* 1，一个线程在循环输出1-100
* 2，在另一个线程输入q的时候中止
* */
public class HomeWork01 {
    public static void main(String[] args) throws InterruptedException {
        Thread_01 thread_01 = new Thread_01();
        Thread02_ thread02_ = new Thread02_(thread_01);
        thread_01.start();
        thread02_.start();
    }
}
class Thread_01 extends Thread{
    private boolean bool =true;

    public void setBool(boolean bool) {
        this.bool = bool;
    }


    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (bool == true)
                System.out.println(i);
            else break;
        }
    }
}
class Thread02_ extends Thread{
    //把线程对象导进来,方便之后的控制bool
    private Thread_01 a;
    private Scanner scanner = new Scanner(System.in);

    public Thread02_(Thread_01 a) {
        this.a = a;
    }

    @Override
    public void run() {
        //直接转换为大写
        if (scanner.next().toUpperCase().charAt(0) == 'Q'){
            a.setBool(false);
            System.out.println("结束");
        }
    }
}