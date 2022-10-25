package com.zcc.demo.demo2;

public class TwoDimensionalArray {
    public static void main(String[] args) {
            int[][] arr = {{1,0,0,2},{0,2},{0,0,4}};
            for(int i = 0;i < arr.length;i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }
    }
}
