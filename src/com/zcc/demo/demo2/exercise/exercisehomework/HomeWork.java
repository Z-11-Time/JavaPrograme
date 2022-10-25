package com.zcc.demo.demo2.exercise.exercisehomework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/**
 * @author Dr.Z
 * @version demo
 */
public class HomeWork {
    public static void main(String[] args) {
        String name = "zcc dsds sdsd";
        change(name);
    }
    static void change(String name){
        String[] arr = name.split(" ");
        System.out.println(String.format("%s,%s  .%c",arr[2],arr[0],arr[1].toUpperCase(Locale.ROOT).charAt(0)));
    }
    Collection col = new ArrayList();
    Iterator iterator = col.iterator();
}