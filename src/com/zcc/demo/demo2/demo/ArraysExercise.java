package com.zcc.demo.demo2.demo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Dr.Z
 * @version demo
 */
public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("red dream",100);
        books[1] = new Book("new 京瓶梅",90);
        books[2] = new Book("青年文摘",5);
        books[3] = new Book("java从入门到放弃",300);
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double priceVal = book1.getPrice() - book2.getPrice();
                if (priceVal > 0){
                    return -1;
                }else if(priceVal < 0){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));
    }
//    public static void compare01(Book[] books,Comparator c){
//        Book temp = null;
//        for (int i = 0; i < books.length - 1; i++) {
//            for (int j = 0; j < books.length - 1 - i; j++) {
//                if(c.compare(books[j].getPrice(),books[j + 1].getPrice())>0){
//                    temp = books[j];
//                    books[j] = books[j+1];
//                    books[j+1] = temp;
//                }
//            }
//        }
//    }

}
class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
