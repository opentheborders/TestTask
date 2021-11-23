package com.company;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Main {

    public static void main(String[] args) {
        int n = 50;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        System.out.println(Arrays.toString(array));
        double max = Arrays.stream(array)
                .reduce((a, b) -> Math.max(a, b))
                .getAsDouble();
        double min = Arrays.stream(array)
                .reduce((a, b) -> Math.min(a, b))
                .getAsDouble();
        OptionalDouble avg = Arrays.stream(array).average();
        System.out.println(max + "\n" + min + "\n" + avg);
    }};

