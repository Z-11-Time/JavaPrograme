package com.zcc.demo.demo2.demo;

import java.util.Arrays;

/**
 * @author Dr.Z
 * @version demo
 */
public class Copy {
    public static void main(String[] args) {
        int[] a = {1,2,30};
        int[] blank = {};
        blank = Arrays.copyOf(a,2);
        System.out.println(Arrays.toString(blank));
    }
}
