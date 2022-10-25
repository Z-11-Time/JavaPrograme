package com.zcc.demo.demo2.exercise.thread;

/**
 * @author Dr.Z
 * @version demo
 */
public class Thread03 {
    public static void main(String[] args) throws InterruptedException {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        for (int i = 0;i < 10;i++){
            Thread.sleep(1000);
            System.out.println("宝宝饱了");
            System.out.println("状态" + daemonThread.getState());
        }
    }
}
class DaemonThread extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hahaha,母狗");

        }
    }
}