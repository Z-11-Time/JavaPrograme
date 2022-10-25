package com.zcc.demo.demo2.demo;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Dr.Z
 * @version demo
 */
public class HashtableExercise {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("01",11);
        table.put("lucy",22);
        table.put("lic",33);
//        table.put(null,54);
        table.remove("01");
        System.out.println(table.get("lic 2"));
        System.out.println(table);
        //进行迭代
        Set entrySet = table.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Object entry=  iterator.next();
            Map.Entry entry1 = (Map.Entry) entry;
            System.out.println(entry1.getKey() + " - - " + entry1.getValue());
        }
    }
}
