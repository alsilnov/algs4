package com.byteworm.sec_1_1.ex_18;

public class Test {
    public static void main(String[] args) {
        System.out.println(mystery1(2, 25));
        System.out.println(mystery1(3, 11));
        System.out.println(mystery2(2, 25));
        System.out.println(mystery2(3, 11));
    }

    // Умножает a на b
    static int mystery1(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery1(a + a, b / 2);
        }
        return mystery1(a + a, b / 2) + a;
    }

    // Возводит a в степень b
    static int mystery2(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return mystery2(a * a, b / 2);
        }
        return mystery2(a * a, b / 2) * a;
    }
}
