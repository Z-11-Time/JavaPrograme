package com.zcc.demo.demo2.TankGame;

import java.util.Vector;

/**
 * @author Dr.Z
 * @version demo
 */
public class EnemyTank extends Tank implements Runnable{

    public EnemyTank(int x, int y) {
        super(x, y);
    }
    //在敌人的坦克，用Vector 保存多个Shot，保证线程安全
    Vector<Shot> shots = new Vector<>();

    @Override
    public void run() {
        while (true){
            //根据坦克方向移动
            switch (getDirect()){
                case 0:
                    moveUp();
                case 1://左
                    moveLift();
                case 2:
                    moveDpown();
                case 3:
                    moveRight();
            }
            //休眠
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //随机改变坦克方向
            setDirect((int)(Math.random()*4));
        }
    }
}
