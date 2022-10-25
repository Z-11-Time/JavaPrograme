package com.zcc.demo.demo2.exercise.thread;

/**
 * @author Dr.Z
 * @version demo
 */
public class Thread02 {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        Thread thread = new Thread(t);

        for (int i = 0; i < 9; i++) {
            System.out.println("hi" + i);
            Thread.sleep(1000);
            if (i == 5) {
                thread.start();
                thread.join();
            }
        }

    }
}

class T implements Runnable {
    boolean bool = true;
    int n = 1;
    @Override
    public void run() {
        while (bool) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
                System.out.println("hello");
            n++;
            if (n==10)
                break;
        }
    }
}
