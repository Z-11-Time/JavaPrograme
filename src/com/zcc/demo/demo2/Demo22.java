package com.zcc.demo.demo2;

/**
 * @author Dr.Z
 * @version demo
 */
public class Demo22 {
    static int num;
    int i;
    public static void main(String[] args) {
        int n1 = 10;
        String n;
        Integer I = Integer.valueOf(100);
        int n2 = 0;
        try {
            num = n1/n2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("没问题");
        try {
            throw new RuntimeException("dsdsdas");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    public void method1(){
        try {
            i = num - 1;
        } catch (Exception e) {
            e.printStackTrace() ;
        }
    }

}
class e extends RuntimeException{
    public e() {
    }
}
class a{
    private int n;
    public a(int n) {
        this.n = n;
    }
}
class b extends a{
    private int c;

    public b(int n, int c) {
        super(n);
        this.c = c;
    }
}
class c extends b{

    public c(int n, int c) {
        super(n, c);
    }
}

