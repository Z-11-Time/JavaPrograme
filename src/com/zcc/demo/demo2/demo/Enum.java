package com.zcc.demo.demo2.demo;

/**
 * @author Dr.Z
 * @version demo
 */
public class Enum {
    public static void main(String[] args) {
        for (Week week:Week.values()) {
            System.out.println(week);
        }
    }
}
enum Week{
    Monday("星期一"),Monday1("星期2"),Monday2("星期3"),Monday3("星期4"),Monday4("星期5");
    private String name;
    Week(String name) {
        this.name = name;
    }

    public String toString() {
            return name;
    }
}
interface IP{
    Void ring();
}
class D{
    IP i = new IP(){
        @Override
        public Void ring() {
            return null;
        }
    };
}
