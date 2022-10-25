package com.zcc.demo.demo2.demo;


import java.util.Iterator;
import java.util.Set;

/**
 * @author Dr.Z
 * @version demo
 */
@SuppressWarnings({"all"})
public class LinkedHashSet {
    public static void main(String[] args) {
        Set set = new java.util.LinkedHashSet();
        set.add(new Customer("AS"));
        set.add(123);
        set.add(new Customer("sds"));
        set.add(543);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }

    public void add(Car jack) {
    }
}
class Customer{
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}