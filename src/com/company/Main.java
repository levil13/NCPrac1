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
        Arrays.sort(args);
    }
}
