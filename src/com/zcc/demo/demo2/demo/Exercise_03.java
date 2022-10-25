package com.zcc.demo.demo2.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Dr.Z
 * @version demo
 */
public class Exercise_03 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("12",2));
        list.add(new Dog("12",24));
        list.add(new Dog("12",14));
        list.add(new Dog("12",1));
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        int x=10;
        x = x ++ +10;
        System.out.println(x);
        //冒泡排序
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                //取出Dog对象
                Dog dog1 = (Dog)list.get(j);
                Dog dog2 = (Dog)list.get(j + 1);
                if(dog1.getAge() > dog2.getAge() ){
                    list.set(j,dog2);
                    list.set(j+1,dog1);
                }
            }

        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
