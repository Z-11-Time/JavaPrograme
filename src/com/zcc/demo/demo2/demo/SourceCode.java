package com.zcc.demo.demo2.demo;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author Dr.Z
 * @version demo
 */
public class SourceCode {
    public static void main(String[] args) {
        ArrayList arraylist = new ArrayList(8);
        for (int i = 0; i < 15; i++) {
            arraylist.add(i);
        }
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
    }
}
