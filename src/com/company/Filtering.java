package com.company;

import java.util.Arrays;
import java.util.OptionalDouble;
/*
1.0. Максимальное, минимальное и среднее значение
Задача:
Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 1].
 */

class Filtering {

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
    }}

