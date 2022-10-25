package com.zcc.demo.demo2.demo;

/**
 * @author Dr.Z
 * @version demo
 */
public class Something {

    public static void main(String[] args) {
        char[] arr1 = {'a','c','d'};
        char[] arr2 = {'g','h','j'};
        int length = arr1.length+arr2.length;
        char[] arr3 = new char[length];
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3,arr1.length+1, arr2.length);
    }
}
