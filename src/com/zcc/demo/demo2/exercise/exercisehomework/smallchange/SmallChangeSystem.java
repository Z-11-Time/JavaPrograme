package com.zcc.demo.demo2.exercise.exercisehomework.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSystem {
    public static void main(String[] args) {
        boolean loop = true;
        Income income = new Income();
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String detail = "-----------零钱通明细----------";
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("\n==========零钱通菜单===========");
            System.out.println("\t\t1 零钱通明细\n\t\t2 收益入账\n\t\t3 消费\n\t\t4 退出");
            System.out.println("请输入1-4:");
            int key = scanner.nextInt();
            switch (key){
                case 1:System.out.println(detail + "\n");
                       break;
                case 2:System.out.println("收益入账");
                       income.money = scanner.nextDouble();
                       income.balance += income.money;
                       detail += "\n收益入账\t" + income.money + "\t" + sdf.format(date) + "\t" + income.balance;
                       break;
                case 3:System.out.println("消费");
                       income.money = scanner.nextDouble();
                       if(income.money < 0){
                           System.out.println("请输入正确的金额");
                           break;
                       }
                           else if(income.money > income.balance){
                               System.out.println("没有这么多余额");
                               break;
                           }
                       System.out.println("消费说明:");
                       income.note = scanner.next();
                       income.balance -= income.money;
                       detail += "\n" + income.note + "\t-" + income.money + "\t" + sdf.format(date) + "\t" + income.balance;
                       break;
                case 4:
                    String choice = null;
                    while(true)
                    {
                        System.out.println("您确定要退出吗");
                        choice = scanner.next();
                        if(choice.equals("y") || choice.equals("n"))
                            break;
                    }
                    if("y".equals(choice)){
                        System.out.println("退出");
                        loop = false;
                    }
                        break;
                default: System.out.println("菜单选择有误，请重新选择");
            }
        }while(loop);
        System.out.println("------退出零钱通项目-----");
    }
}
