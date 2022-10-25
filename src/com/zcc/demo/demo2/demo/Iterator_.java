package com.zcc.demo.demo2.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Dr.Z
 * @version demo
 */
public class Iterator_ {
    public static void main(String[] args) {
        List col = new ArrayList();
        col.add(new Book_("Your Wife","Zcc",5134895));
        col.add(new Book_("Your Wife","Zcc",5134895));
        col.add(new Book_("Your Wife","Zcc",5134895));
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        try {
            Object next =  iterator.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        iterator = col.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        for(Object Book : col){
            System.out.println(Book);
        }
        System.out.println(col);
    }
}
abstract class ssdsds{
    abstract void sd();
    static void c(){
        System.out.println("ddd");
    }
        }

class Book_{
    private String name;
    private String author;
    private double price;

    public Book_(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book_{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
