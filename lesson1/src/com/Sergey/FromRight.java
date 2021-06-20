package com.Sergey;

public class FromRight {
    public static void main(String[] args) {
        int number = 347_693_485;
        char digit;
        int fromChar;
        String numberString = String.valueOf(number);
        int stringLength = numberString.length();
        for (int i = 0; i < stringLength; i++) {
            digit = numberString.charAt(i);
            fromChar = digit - '0';
            if (fromChar % 2 == 0 && fromChar % 3 == 0) {
                System.out.println("fizzbuzz");
            } else if (fromChar % 2 == 0) {
                System.out.println("fizz");
            } else if (fromChar % 3 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(fromChar);
            }
        }
    }
}

