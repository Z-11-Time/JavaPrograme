package com.zcc.demo.demo2.demo;

/**
 * @author Dr.Z
 * @version demo
 */
public class InClass {
    public static void main(String[] a) {
        OutClass outClass = new OutClass();
        OutClass.InClass_ z = OutClass.ge();
        z.print_();
    }
}
class OutClass{
    public static class InClass_{
        void print_(){
            System.out.println("right");
        }
    }
    public static InClass_ ge(){
        return new InClass_();
    }
}