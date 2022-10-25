package com.zcc.demo.demo2.demo;

/**
 * @author Dr.Z
 * @version demo
 */
public class IandO {
    public static void main(String[] args) {
        new A().f1();
    }
}
class A{
    private String name;
    public void f1(){
        class B{
            private final String name = "ssss";
            public void show(){
                System.out.println(A.this.name);
            }
        }
        new B().show();
    }
}
