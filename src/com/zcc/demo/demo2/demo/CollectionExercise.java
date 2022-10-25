package com.zcc.demo.demo2.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Dr.Z
 * @version demo
 */
public class CollectionExercise {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Dog("lyd",20));
        col.add(new Dog("lyd",21));
        col.add(new Dog("lyd",22));
        Iterator iterator = col.iterator();//迭代器
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object o : col) {
            System.out.println(o);
        }

    }
}