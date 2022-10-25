package com.zcc.demo.demo2.exercise.thread;

/**
 * @author Dr.Z
 * @version demo
 */
public class ThreadRxercise01 {
    public static void main(String[] args) throws InterruptedException {
//        //继承Thread类
//        Sale01 sale01 = new Sale01();
//        Sale01 sale02 = new Sale01();
//        Sale01 sale03 = new Sale01();
//        Thread.sleep(1000);
//        sale01.setPriority(Thread.MIN_PRIORITY);
//        sale01.start();
//        sale02.start();
//        sale03.start();

//        for (int i = 0;i< 20;i++){
//            Thread.sleep(100);
//            System.out.println("hello");
//            if (i == 19){
//                sale01.join();
//            }
//        }
//        sale01.interrupt();
//        sale01.setName("mugo");
//        System.out.println(sale01.getName());
//        sale01.setLoop(true);

//        实现runnable接口
        Sale02 sale04 = new Sale02();
        Thread  thread01 = new Thread(sale04);
        Thread thread02 = new Thread(sale04);
        Thread thread03 = new Thread(sale04);
        thread01.start();
        thread02.start();
        thread03.start();

    }
}
//priority
class Sale01 extends Thread{
    static int count = 100;
    boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public  void run() {

        while (loop){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("被interrput");
            }
            for (int i = 0;i < 10; i++){
                System.out.println("s对的");
            }
        }

    }
}
class Sale02 implements Runnable{

    int count = 100;
     void sell(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("剩余票数：" + --count);
    }
    @Override
    public synchronized void run() {
        while (true){
            if (count == 0)
            break;
            sell();
        }
    }
}