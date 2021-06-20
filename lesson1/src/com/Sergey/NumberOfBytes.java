package com.Sergey;

public class NumberOfBytes {
    public static void main(String[] args) {
        long number = 1_000_000L;
        System.out.println(Long.toBinaryString(number));
        String binaryNumber = Long.toBinaryString(number);
        int length = binaryNumber.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            char element = binaryNumber.charAt(i);
            if (element == '1') {
              count++;
            }
        }
        System.out.println(count);
    }
}
