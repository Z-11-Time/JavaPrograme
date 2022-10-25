package com.zcc.demo.demo2.demo;

public class Test_01 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("吃jj了别睡懒觉了");
            }
        });
    }
}
interface Bell{
    void ring();
}
class CellPhone{
    public void alarmClock(Bell bell){
        bell.ring();
    }
}
