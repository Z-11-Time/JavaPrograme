package com.zcc.demo.demo2.TankGame;

/**
 * @author Dr.Z
 * @version demo
 */
public class Bomb {
    int x,y;//炸弹的坐标
    int life = 25;//炸弹的生命周期
    boolean isLive = true;//是否存活

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //减少生命值
    public void lifeDown() throws InterruptedException {
        if (life > 0){
            life--;
            Thread.sleep(25);
        }else {
            isLive = false;
        }
    }
}
