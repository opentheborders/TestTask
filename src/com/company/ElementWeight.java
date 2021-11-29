/*
2.1. Генерация случайного элемента с весом

Задача:

Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
Пример:
Дан массив [1, 2, 3], и массив весов [1, 2, 10].
В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».

 */

package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ElementWeight {
    public static void random(int v[], int w[]){
        int n = IntStream.of(w).sum();
        int array[] = new int[n];
        int iterator = 0;
        for(int i = 0; i<w.length; i++) {

            for(int j = 0; j<w[i]; j++){
                array[iterator++] = v[i];
            }
        }
        System.out.println(Arrays.toString(array));
        int random = (int) (Math.random() * (array.length-1));
        System.out.println(array[random]);
    }
    public static void main(String[] args) {
        int []value = {1,2,3};
        int []weight = {1,2,10};
        random(value, weight);
    }
}
