package com.zcc.demo.demo2.TankGame;

import javax.swing.*;

/**
 * @author Dr.Z
 * @version demo
 */
//继承窗口
public class TankGame01 extends JFrame {
    //定义MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        //初始化窗口
        TankGame01 tankGame01 = new TankGame01();
    }
    public TankGame01() {
        //启动线程
        mp = new MyPanel();
        new Thread(mp).start();
        this.add(mp);//加入绘图区
        //定义窗口
        this.setSize(1000,750);
        this.addKeyListener(mp);
        //当点击窗口的X，程序才真正的退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可视
    }
}
