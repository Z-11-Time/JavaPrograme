package com.zcc.demo.demo2.demo;

/**
 * @author Dr.Z
 * @version demo
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog_ dog_ = new Dog_();

    }
}
class Dog_ implements Runnable{

    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("母狗汪汪叫" + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
