package com.zcc.demo.demo2.demo;

/**
 * @author Dr.Z
 * @version demo
 */
public class InnerClassExercise {
    public static void main(String[] args) {
        Cellphone_ cellphone = new Cellphone_();
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("wake up pig!");
            }
        });
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("wake up dog!");
            }
        });
    }
}
interface Bell_{
    void ring();
}
class Cellphone_{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}
