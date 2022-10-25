package com.zcc.demo.demo2.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Dr.Z
 * @version demo
 */
@SuppressWarnings({"all"})
public class TreeSetExercise {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
//                return ((Integer)o1).compareTo((Integer) o2);
                return ((String)o1).length() - ((String) o2).length();
            }
        });
//        treeSet.add(new right(11,11));
//        treeSet.add(new right(12,11));
//        treeSet.add(new right(13,11));
//        treeSet.add(new right(14,11));
        treeSet.add("20");
        treeSet.add("12");
        treeSet.add("15" );
        ArrayList arrayList = new ArrayList();
//        Collections.sort(arrayList);
        System.out.println(treeSet);
    }
}
@SuppressWarnings({"all"})
class right{
    private int age;
    private int salary;

    public right(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

}
