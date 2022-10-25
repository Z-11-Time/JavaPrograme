package com.zcc.demo.demo2.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @author Dr.Z
 * @version demo
 */
public class DrawCircle extends JFrame{//继承画框
    //定义画板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();//初始化画框
    }
    public DrawCircle(){
        //初始化画板
        mp = new MyPanel();
        //把画板放入画框
        this.add(mp);
        //设置画框大小
        this.setSize(400,300);
        //当点击窗口的X，程序才真正的退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可视
    }
}
//定义一个MyPanel，继承JPanel类，画板
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {//绘图的方法
        super.paint(g);//调用父类的方法，初始化
        g.drawOval(10,10,100,100);//画出椭圆的坐标和长宽
        System.out.println("paint 方法被调用");
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/effd67c9f036033a8c0c7e20e72e2136.jpg"));
        g.drawImage(image,10,10,300,157,this);
    }
}