package com.zcc.demo.demo2.demo;

/**
 * @author Dr.Z
 * @version demo
 */
public class Demo_03 {

    public static void main(String[] args) {
        String a = "1284565654556.21";
        StringBuffer sb = new StringBuffer(a);
        for(int i = sb.lastIndexOf(".") - 3;i > 0; i -= 3){
            sb.insert(i,",");
        }
        System.out.println(sb);

    }
}

