package org.example.medium;

public class MinimizeXor {
    public static int minimizeXor(int num1, int num2) {
        if (Integer.bitCount(num1) == Integer.bitCount(num2)) {
            return num1;
        }
        if (Integer.bitCount(num2) > Integer.bitCount(num1)) {
            while (Integer.bitCount(num1) != Integer.bitCount(num2)) {
                num1++;
            }
            return num1;
        }
        while (Integer.bitCount(num1) != Integer.bitCount(num2)) {
            num1--;
        }
        return num1;
    }
}
