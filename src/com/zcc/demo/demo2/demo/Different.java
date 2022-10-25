package com.zcc.demo.demo2.demo;

/**
 * @author Dr.Z
 * @version demo
 */
public class Different {
    public static void main(String[] args) {
        Outer_ outer_ = new Outer_();
        System.out.println(outer_.get(100));
    }
}
class Outer_{
    class Inner extends Other{
        @Override
        public String toString() {
            return "Inner{" +
                    "sal=" + sal +
                    '}';
        }

        public Inner(int sal) {
            super(sal);

        }
    }
    public Inner get(int sal){
        return new Inner(sal);
    }
}
class Other{
    public int sal;

    public Other(int sal) {
        this.sal = sal;
    }
}