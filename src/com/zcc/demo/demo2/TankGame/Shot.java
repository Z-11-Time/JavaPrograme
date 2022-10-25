package com.zcc.demo.demo2.TankGame;

/**
 * @author Dr.Z
 * @version demo
 */
public class Shot implements Runnable {
    int x;
    int y;
    int direct = 0;//子弹方向
    int speed = 20;//子弹速度
    boolean isLive = true;//子弹是否还存在

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true) {//线程执行之后循环坐标位置
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            switch (direct) {
                case 0:
                    y -= speed;
                    break;
                case 1:
                    x -= speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x += speed;
                    break;
            }
            System.out.println("x= " + x + "y=" + y);
            //当子弹碰到边界或者碰到了tank退出
            if ((!(x >= 0 && x <= 1000 && y >= 0 && y <= 750))||!isLive) {
                isLive = false;
                System.out.println("死了");
                break;
            }
        }
    }
}
