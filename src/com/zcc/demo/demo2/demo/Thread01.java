package com.zcc.demo.demo2.demo;

/**
 * @author Dr.Z
 * @version demo
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        //现在创建的Cat对象可以当作线程使用
        Cat cat = new Cat();
        //用start方法启动子线程->最终会执行Cat的run方法
        //如果直接用cat.run（）实际上是主线程在执行，且在这个方法执行玩波比之前不会执行下一个方法 会阻塞线程
        cat.start();
        //获取当前线程的名字
        System.out.println(Thread.currentThread().getName());
        //主线程
        for(int i = 0;i<10;i++){
            System.out.println("主线程" + i);
            Thread.sleep(1000);
        }
        //主线程main和子线程Thread - 0交替执行，并发，不会阻塞线程
        //只有当所有的线程都结束了，进程才会结束
    }
}
//当一个类继承了Thread(线程)类，该类(Cat)就是一个线程
//Thread中的run方法也是实现了Runnable接口而 重写的
class Cat extends Thread{
    int times = 0;
    @Override
    //需求：每秒输出一次
    public void run() {
        while (true) {
            times++;
            System.out.println("一秒一个小猫咪");
            //休眠一秒
            try {
                Thread.sleep(1000);//单位是毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 8000){
                break;
            }
        }
        System.out.println(Thread.currentThread().getName());
    }
}
