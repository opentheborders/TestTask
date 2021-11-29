package com.company;

import java.util.Arrays;

/*3.0. Двоичный поиск
        Задача:
        Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
        Используйте перебор и двоичный поиск для решения этой задачи.
        Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).
        */

public class SortingFieldNew {

    public static void main(String[] args) {
        int number = 567;
        int []array = new int[10000];
        for (int i = 1; i<array.length; i++){
            array[i] = i;
        }
        
        long startTime2 = System.currentTimeMillis();
        BrutForce bF = new BrutForce();
        System.out.println(bF.search(number, array));
        long endTime2 = System.currentTimeMillis();
        System.out.println("Total time  " + (endTime2-startTime2));

        long startTime1 = System.currentTimeMillis();
        BinarySearch bS = new BinarySearch();
        System.out.println(bS.search(number, array));
        long endTime1 = System.currentTimeMillis();
        System.out.println("Total time  " + (endTime1-startTime1));

    }
}
