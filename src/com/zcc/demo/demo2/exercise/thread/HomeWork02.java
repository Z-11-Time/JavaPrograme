package com.zcc.demo.demo2.exercise.thread;

/**
 * @author Dr.Z
 * @version demo
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread thread0 = new Thread(bank);
        Thread thread1 = new Thread(bank);
        Thread thread2 = new Thread(bank);
        thread0.start();
        thread1.start();
        thread2.start();
    }
}
class Bank implements Runnable {
    private double money = 100000;

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                if (money <= 0){
                break;
            }
                money -= 1000;
                System.out.println("剩余 " + money);

            }
        }
    }
}