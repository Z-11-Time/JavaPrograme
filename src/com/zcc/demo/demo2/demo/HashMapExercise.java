package com.zcc.demo.demo2.demo;

import java.util.*;

/**
 *@author Dr.Z
 *@version demo
 */public class HashMapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("01","jack");
        hashMap.put("02","jack");
        hashMap.put(null,"jack");
        //测试树化
        // （增加链表长度直到超过8）
//        for (int i = 0; i < 13; i++) {
//            hashMap.put(new Al(i),"hello");
//        }
        //第一组:用Map的key
        Set set = hashMap.keySet();
        //增强for循环
        for (Object key : set) {
            System.out.println(key + "-" + hashMap.get(key));
        }
        //迭代器
        Iterator iterator1 = set.iterator();
        while (iterator1.hasNext()){
            Object key = iterator1.next();
            System.out.println(key + "-" + hashMap.get(key));
        }//第二组，直接输出value
        Collection values = hashMap.values();
        //增强for
        for (Object value :values) {
            System.out.println(value);
        }
        //迭代器
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value =  iterator2.next();
            System.out.println(value);
        }
        //第三组，EntrySet
        Set entrySet = hashMap.entrySet();
        //增强for循环
        for(Object Entry : entrySet){
            Map.Entry entry1 = (Map.Entry) Entry;
            System.out.println(entry1.getKey() + "-" + entry1.getValue());
        }
        //迭代器
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            Map.Entry entry1 = (Map.Entry) next;
//            System.out.println(entry1.getClass());
            System.out.println(entry1.getKey() + " " + entry1.getValue());
        }
    }
}
class Al{
     private int i;

    public Al(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Al al = (Al) o;
        return i == al.i;
    }
//重写了hashCode，让hash值固定，一直增加链表
    @Override
    public int hashCode() {
        return 100;
    }
}
