/*1.2. Поиск простых чисел

Задача:

Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.
*/
package com.company;

import java.util.Arrays;
import java.util.OptionalDouble;

public class SimpleNumbers {

    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= i; j++) {
                if (j < i  && i%j == 0) {
                    break;
                } else
                if (i % j == 0) {
        System.out.println(i);

        }}}}}

