package com.zcc.demo.demo2.TankGame;

/**
 * @author Dr.Z
 * @version demo
 */
public class MyTank extends Tank{
    //定义shot对象
    Shot shot = null;

    public MyTank(int x, int y) {
        super(x, y);
    }
    //射击方法
    public void shotEnemyTank(){
        switch (getDirect()){//获取射击方向
                case 0:
                shot = new Shot(getX() + 20,getY(),0);break;
                case 1:
                shot = new Shot(getX() -10,getY()+30,1);break;
                case 2:
                shot = new Shot(getX() + 20,getY()+60,2);break;
                case 3:
                shot = new Shot(getX() + 50,getY()+30,3);break;
        }
        //启动线程
        new Thread(shot).start();
    }
}
