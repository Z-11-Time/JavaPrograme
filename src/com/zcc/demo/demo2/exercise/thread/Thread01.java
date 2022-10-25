package com.zcc.demo.demo2.exercise.thread;

/**
 * @author Dr.Z
 * @version demo
 */
public class Thread01 {
    public static void main(String[] args) {
        T3 t3 = new T3();
        T4 t4 = new T4();
        Thread thread1 = new Thread(t3);
        Thread thread2 = new Thread(t4);
        thread1.start();
        thread2.start();
    }
}
class T3 implements Runnable{

    int n = 0;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n++;
            System.out.println("hello" + n);
            if(n == 100){
                break;
            }
        }
    }
}
class T4 implements Runnable{

    int n = 0;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            n++;
            System.out.println("hi" + n);
            if(n == 50){
                break;
            }
        }
    }
}
