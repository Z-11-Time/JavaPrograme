package com.zcc.demo.demo2.exercise;

import java.util.Scanner;

class AccountTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cip = scanner.next();
        Account account = new Account("123",200,cip);
        System.out.println(account.cip);
        System.out.println(account.money);
        System.out.println(account.name);
    }
}

class Account{
    String name;
    double money;
    String cip;

    public Account(String name, double money, String cip) {
        this.setName(name);
        this.setMoney(money);
        this.setCip(cip);
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <=4)
            this.name = name;
        else{
            System.out.println("请输入长度在2-4之间的名称");
            this.name = "无名";
        }
    }

    public void setMoney(double money) {
        if(money > 20)
            this.money = money;
        else {
            System.out.println("您的余额不足");
        }
    }

    public void setCip(String cip) {
        if(cip.length() == 6)
            this.cip = cip;
        else{
            System.out.println("密码必须是6位");
            this.cip = null;
        }
    }

}
