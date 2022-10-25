package com.zcc.demo.demo2.exercise.houserent.service;

import com.zcc.demo.demo2.exercise.houserent.domain.House;

/*
* 1，响应housdeview的调用
* 2，完成对房屋系统的各种操作（增删查改）
* */
public class HouseService {
    private House[] houses;
    private int houseNums = 1;
    private int idCounter = 1;//记录id
    public HouseService(int size){
        houses = new House[size];//指定数组大小
        houses[0] = new House(1,"jack","112","海院路",2000,"为出租");
    }
    //findById方法，返回house对象或者null
    public House findById(int findId){
        //遍历数组
        for (int i = 0; i < houseNums; i++) {
            if(findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
    public boolean del(int delId){
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()){
                index = i;
            }
        }
        if(index == 1){
           return false;
        }
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;
    }
    public boolean add(House newHouse){
            if(houseNums >= houses.length){
                System.out.println("数组已满不能在添加");
                return false;
            }
            houses[houseNums++] = newHouse;
            //设计id自增长
            newHouse.setId(++idCounter);
            return true;
    }
    //list方法，返回houses
    public House[] list(){
        return houses;
    }

}
