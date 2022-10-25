package com.zcc.demo.demo2.exercise.houserent.view;

import com.zcc.demo.demo2.exercise.houserent.domain.House;
import com.zcc.demo.demo2.exercise.houserent.service.HouseService;
import com.zcc.demo.demo2.exercise.houserent.utils.Utility;

/*
* 1,显示界面
* 2，接受用户的输入
* 3，调用houseService完成对房屋信息的各种操作
* */
public class HouseView {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接受用户选择
    private HouseService houseService = new HouseService(10);//设置数组的大小
//修改房屋信息
    public void update(){
        System.out.println("修改房屋信息");
        System.out.println("请选择修改的id");
        int updateId = Utility.readInt();
        if(updateId == -1){
            System.out.println("您已放弃修改");
            return;
        }
        houseService.findById(updateId);

    }
    public void findHouse(){
        System.out.println("查找房屋");
        System.out.println("输入id");
        int findId = Utility.readInt();
        //调用方法
        House house = houseService.findById(findId);
        if(house != null){
            System.out.println(house);
        }else{
            System.out.println("=========查找到房屋信息id不存在==========");
        }
    }
    //完成退出
    public void exit(){
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            loop = false;
        }
    }
    //编写delHouse()
    public void delHouse(){
        System.out.println("===========删除房屋信息==========");
        System.out.println("请输入编号");
        int delId = Utility.readInt();
        if(delId == -1){
            System.out.println("=========放弃删除=========");
            return;
        }
        char choice = Utility.readConfirmSelection();//本省就自带循环
        if(choice == 'Y'){
            if(houseService.del(delId)){
                System.out.println("===========删除房屋信息成功==========");
            }else{
                System.out.println("===========原编号不存在，删除失败==========");
            }
        }else{
            System.out.println("==========放弃删除============");
        }
    }
    //编写addHouse()接受输入，创建house对象，调用add方法
    public void addHouse(){
        System.out.println("===========添加房屋============");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);
        //创建了一个新的house对象，注意id 是系统分配的
        House newHouse = new House(0,name,phone,address,rent,state);
        if(houseService.add(newHouse)){
            System.out.println("=========房屋添加成功=========");
        }else{
            System.out.println("=========房屋添加失败=========");
        }
    }
    //显示listHouse()显示房屋列表
    public void listHouses(){
        System.out.println("=============房 屋 信 息=============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(为出租/已出租)");
        House[] house = houseService.list();//得到所有的房屋信息
        for (int i = 0; i < house.length; i++) {
            if (house[i] == null)//空的数组就退出
                break;
            System.out.println(house[i]);
        }
        System.out.println("=============房 屋 信 息 显 示 完 毕=============");

    }
    public void mainMenu(){

        do{
            System.out.println("===========房屋出租系统菜单============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 显 示 房 屋 信 息");//房屋列表
            System.out.println("\t\t\t6 退     出");
            System.out.println("请输入你的选择（1-6）：");
            key = Utility.readChar();
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    System.out.println("修 改");
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        }while(loop);
    }
}
