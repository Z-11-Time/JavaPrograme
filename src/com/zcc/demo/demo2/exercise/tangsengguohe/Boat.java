package com.zcc.demo.demo2.exercise.tangsengguohe;

/**
 * @author Dr.Z
 * @version demo
 */
public class Boat implements Vehicles {
    public static void main(String[] args) {
        try {
            hh(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void work() {
        System.out.println("特殊情况用船");
    }
    static void hh(int n){
        System.out.println("对吗？");
        if (n > 0){
            throw new RuntimeException("对的");
        }

    }

}
