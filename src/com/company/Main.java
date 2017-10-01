package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        sort(args);
        print(args);
    }

    public static void print(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void sort(String[] args) {
        for (int i = args.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (args[j].compareTo(args[j + 1]) > 0) {
                    String temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
        }
    }
}
