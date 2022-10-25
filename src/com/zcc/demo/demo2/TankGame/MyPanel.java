package com.zcc.demo.demo2.TankGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author Dr.Z
 * @version demo
 */
//为了让panel不停的重绘子弹，需要将mPanel实现Runnable，当作线程
//坦克游戏的绘图区
public class MyPanel extends JPanel implements KeyListener, Runnable {
    private Graphics g;
    //定义我的坦克
    MyTank myTank = null;
    //把敌方坦克放入Vector
    Vector<EnemyTank> enemyTanks = new Vector<EnemyTank>();
    //存放炸弹
    Vector<Bomb> bombs = new Vector<Bomb>();
    int enemyTanksSize = 3;

    //定义三张图片，用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;
    int x = 0;
    int y = 0;
    int direct = 0;

    public MyPanel() {
        myTank = new MyTank(100, 100);//初始化坦克
        //绘制地方坦克
        for (int i = 0; i < enemyTanksSize; i++) {
            //创建一个坦克对象
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            //加入坦克
            enemyTanks.add(enemyTank);
            //坦克的方向
            enemyTank.setDirect(2);
            //给enemyTank 加入一颗子弹
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            //加入到enemyTanks的子弹Vector中
            enemyTank.shots.add(shot);
            //启动shot线程
            new Thread(shot).start();
        }
        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);//填充矩形
        //画坦克-封装方法
        drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirect(), 0);
        //绘制我的坦克的子弹
        if (myTank.shot != null && myTank.shot.isLive != false) {
            g.fill3DRect(myTank.shot.x, myTank.shot.y, 5, 5, false);
        }
        //如果bomns 集合中有对象
        for (int i = 0;i< bombs.size();i++){
            //取出炸弹
            Bomb bomb = bombs.get(i);
            //根据life去画对应的图片
            if (bomb.life>15){
                g.drawImage(image1,bomb.x,bomb.y,60,60,this);
            }else if(bomb.life>5){
                g.drawImage(image2,bomb.x,bomb.y,60,60,this);
            }
            else {
                g.drawImage(image3,bomb.x,bomb.y,60,60,this);
            }
            try {
                bomb.lifeDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (bomb.life == 0){
                bombs.remove(bomb);
            }
        }
        //绘制敌人的坦克
        //遍历对象(创建三个坦克,和子弹)
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = this.enemyTanks.get(i);
            //判断当前enemyTank是否活着，活着才画
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
                //画出enemyTank的所有子弹(enemyTank对象中的是一个Vector必须遍历)
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    //取出shots中的子弹
                    Shot shot = enemyTank.shots.get(j);
                    //绘制
                    if (shot.isLive) {
                        g.fill3DRect(shot.x, shot.y, 5, 5, false);
                    } else {
                        //从Vector移除
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }


    }


    /**
     * x，y 坦克的左上角坐标
     * g 画笔
     * direct 坦克的方向
     * type 坦克的类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克的方向，绘制坦克
        switch (direct) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.drawLine(x + 20, y + 30, x + 20, y);
                g.fillOval(x + 10, y + 20, 20, 20);
                break;
            case 1:
                g.fill3DRect(x - 10, y + 10, 60, 10, false);
                g.fill3DRect(x, y + 20, 40, 20, false);
                g.fill3DRect(x - 10, y + 40, 60, 10, false);
                g.drawLine(x + 20, y + 30, x - 10, y + 30);
                g.fillOval(x + 10, y + 20, 20, 20);
                break;
            case 2:
                g.fill3DRect(x, y, 10, 60, false);
                g.fill3DRect(x + 10, y + 10, 20, 40, false);
                g.fill3DRect(x + 30, y, 10, 60, false);
                g.drawLine(x + 20, y + 30, x + 20, y + 60);
                g.fillOval(x + 10, y + 20, 20, 20);
                break;
            case 3:
                g.fill3DRect(x - 10, y + 10, 60, 10, false);
                g.fill3DRect(x, y + 20, 40, 20, false);
                g.fill3DRect(x - 10, y + 40, 60, 10, false);
                g.drawLine(x + 20, y + 30, x + 50, y + 30);
                g.fillOval(x + 10, y + 20, 20, 20);
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    //编写方法，判断我防坦克的子弹是否撞到了敌方坦克
    public void hitTannk(Shot shot, EnemyTank enemyTank) {
        switch (enemyTank.getDirect()) {
            case 0:
            case 2:
                if (shot.x > enemyTank.getX() && shot.x < enemyTank.getX() + 40
                        && shot.y > enemyTank.getY() && shot.y < enemyTank.getY() + 60) {
                    shot.isLive = false;
                    enemyTank.isLive = false;
                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                    //当我的子弹击中敌人坦克后，将enemyTank 从Vector 拿掉
                    enemyTanks.remove(enemyTank);
                }
                break;
            case 1:
            case 3:if (shot.x > enemyTank.getX() && shot.x < enemyTank.getX() + 60
                    && shot.y > enemyTank.getY() && shot.y < enemyTank.getY() + 40) {
                shot.isLive = false;
                enemyTank.isLive = false;
                //当我的子弹击中敌人坦克后，将enemyTank 从Vector 拿掉
                enemyTanks.remove(enemyTank);
                Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                bombs.add(bomb);
            }
            break;
        }
    }

    //字符输出触发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按压触发
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            myTank.setDirect(0);
//            y-=10;
//            myTank.setY(myTank.getY() - 1);
            myTank.moveUp();//大问题，他妈值出不来但是代码是运行的
//            tank.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            myTank.setDirect(1);
//            x-=10;
            myTank.moveLift();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            myTank.setDirect(2);
            myTank.moveDpown();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            myTank.setDirect(3);
            myTank.moveRight();
        }
        //J射击
        if (e.getKeyCode() == KeyEvent.VK_J) {
            myTank.shotEnemyTank();//重要的执行命令
        }
        this.repaint();
    }

    //松开触发
    @Override
    public void keyReleased(KeyEvent e) {
//        System.out.println((char) e.getKeyCode());
    }

    @Override
    public void run() {//不停刷新
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //判断是否有tank被击中
            if (myTank.shot != null && myTank.shot.isLive) {
                //遍历所有的坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTannk(myTank.shot, enemyTank);
                }
            }
            this.repaint();
        }
    }
}
