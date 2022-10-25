package com.zcc.demo.demo2.exercise.houserent.houserent;

import com.zcc.demo.demo2.exercise.houserent.view.HouseView;

public class HouseRentApp {
    public static void main(String[] args) {
        // 创建houseview对象，并且显示主菜单，是整个程序的入口
        new HouseView().mainMenu();
        System.out.println("===你退出房屋出租系统===");
    }
}
