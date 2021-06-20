package com.Sergey;

public class FromLeft {

    public static void main(String[] args) {
        int number = 347_693_485;
        int module;
        while (number > 1) {
            module = number % 10;
            if (module % 2 == 0 && module % 3 == 0) {
                System.out.println("fizzbuzz");
            } else if (module % 2 == 0) {
                System.out.println("fizz");
            } else if (module % 3 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(module);
            }
            number /= 10;
        }

    }
}
