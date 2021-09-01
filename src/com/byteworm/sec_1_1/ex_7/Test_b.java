package com.byteworm.sec_1_1.ex_7;

public class Test_b {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
