package com.byteworm.sec_1_1.ex_7;

import edu.princeton.cs.algs4.StdDraw;

public class Test_b {
    public static void main(String[] args) {
        StdDraw.setXscale(0,10);
        StdDraw.setYscale(0,10);
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
