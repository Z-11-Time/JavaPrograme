package com.zcc.demo.demo2.exercise.List;

import java.util.*;

/**
 * @author Dr.Z
 * @version demo
 */
public class HomeWork_02 {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("jack",650);
        m.put("tom",1200);
        m.put("smith",2900);
        m.put("jack",25000);
        Set set = m.keySet();
        for (Object key : set){
            m.put(key,(int)m.get(key)+100);
        }
        Set entrySet = m.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            Map.Entry Key = (Map.Entry) key;
            System.out.println(((Map.Entry<?, ?>) key).getKey());
        }
        Collection values = m.values();
        for(Object value : values){
            System.out.println(value);
        }
    }
}