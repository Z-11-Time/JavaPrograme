package com.zcc.demo.demo2.exercise.List;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author Dr.Z
 * @version demo
 */
public class HomeWork_03 {
    public static void main(String[] args) {
        HashMap hashSet = new HashMap();
        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "AA");
        hashSet.put(11,p1);
        hashSet.put(11,22);
        p1.name = "CC";
        hashSet.remove(p1);
        System.out.println(hashSet);
    }
}
class Person{
    public int Id;
    public String name;

    public Person(int id, String name) {
        Id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Id == person.Id && Objects.equals(name, person.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(Id, name);
//    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
