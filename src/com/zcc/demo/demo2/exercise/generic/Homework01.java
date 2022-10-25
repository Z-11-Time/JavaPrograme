package com.zcc.demo.demo2.exercise.generic;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @author Dr.Z
 * @version demo
 */
public class Homework01 {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        DAO<User> dao = new DAO<User>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,18,"jac"));
        dao.save("003",new User(3,15,"jak"));
        dao.list();
    }
}

class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public DAO() {
    }

    public void save(String id, T entity) {
        map.put(id, entity);
    }
    @Test
    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public void list() {
        Set<Map.Entry<String, T>> entries = map.entrySet();
        Iterator<Map.Entry<String, T>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, T> next =  iterator.next();
            System.out.println(next.getValue());
        }
    }
    public void delete(String id) {
        map.remove(id);
    }

}

class User {
    private int id, age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
