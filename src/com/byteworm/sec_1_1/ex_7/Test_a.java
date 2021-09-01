package com.byteworm.sec_1_1.ex_7;

public class Test_a {
    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > 0.01) {
            t = (9.0 / t + t) / 2.0;
            System.out.println(t);
        }
        System.out.println(t);
    }
}
