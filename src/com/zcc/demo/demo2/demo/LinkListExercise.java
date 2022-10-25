package com.zcc.demo.demo2.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Dr.Z
 * @version demo
 */
public class LinkListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Node node0 = new Node("11");
        Node node1 = new Node("22");
        Node node2 = new Node("33");
        //双向链表,顺链接
        node0.next = node1;
        node1.next = node2;
        //双向链表，逆链接
        node2.pre = node1;
        node1.pre = node0;
        //定义头尾节点
        Node first = node0;
        Node last = node2;
        //新插入一个节点
        Node aNew = new Node("new");
        //插入01之间
        node0.next = aNew;
        aNew.pre = node0;
        node1.pre = aNew;
        aNew.next = node1;
        //linkList
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        //一除
        linkedList.remove();
        //新建HashSet对象
        HashSet hashSet = new HashSet();
        for (int i = 100; i > 0; i--) {
              hashSet.add(i) ;
        }
        hashSet.remove(1);
        System.out.println(hashSet.add("1"));
        //迭代器
        Iterator arr = hashSet.iterator();//成员内部类
        //迭代器遍历
        while (arr.hasNext()) {
            Object next =  arr.next();
            System.out.println(next);
        }
        //for增强遍历
        for(Object o : hashSet){
            System.out.println(o);
        }
//        linkedlist的遍历
        while (true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}
class Node{
    public Object item;
    public Node next;
    public Node pre;
    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node item=" + item ;
    }
}
