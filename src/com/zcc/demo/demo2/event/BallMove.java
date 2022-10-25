package com.zcc.demo.demo2.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Dr.Z
 * @version demo
 * 键盘控制小球
 */
public class BallMove extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        //可以监听mypanel对象发生的事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//面板，画小球
//KeyListener 是监听器，可以监听键盘
class MyPanel extends JPanel implements KeyListener {
    //为了能让它动，把坐标设置成变量
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x, y, 30, 30);
    }
    //字符输出触发
    @Override
    public void keyTyped(KeyEvent e) {

    }
    //按压触发
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W ){
            y--;
        }
        else if(e.getKeyCode() == KeyEvent.VK_A ){
            x--;
        }
        else if(e.getKeyCode() == KeyEvent.VK_S ){
            y++;
        }
        else if(e.getKeyCode() == KeyEvent.VK_D ){
            x++;
        }
        this.repaint();
    }
    //松开触发
    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println((char) e.getKeyCode());
    }
}