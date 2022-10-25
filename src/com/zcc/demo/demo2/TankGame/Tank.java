package com.zcc.demo.demo2.TankGame;

/**
 * @author Dr.Z
 * @version demo
 * 坦克的封装类
 */
public class Tank {
    //定义位置坐标
    private int x;
    public int y;
    public int direct;
    public int speed = 1;
    public boolean isLive= true;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public void moveUp() {

        System.out.println("12");
        System.out.println(y);
        this.y -= speed;
    }

    public void moveDpown() {
        y += speed;
    }

    public void moveLift() {
        x -= speed;
    }

    public void moveRight() {
        x += speed;
    }
}
