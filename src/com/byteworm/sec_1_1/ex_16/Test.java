package com.byteworm.sec_1_1.ex_16;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(ex(6));
    }

    static String ex(int n) {
        if (n <= 0) {
            return "";
        }
        return ex(n - 3) + n + ex(n - 2) + n;
    }
}
