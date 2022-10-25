package com.zcc.demo.demo2.demo;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Dr.Z
 * @version demo
 */
public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("222222000");
        BigInteger c = new BigInteger("3");
        System.out.println(b.divide(c));
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf.format(date));
    }
}
