/*
1.3. Удаление из массива

Задача:

Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
* */


package com.company;

import java.util.Arrays;
import java.util.OptionalDouble;

class CheckIt {
    public static int[] compare(int array[], int number, int n){

            int counter = 0;
        for(int i=0; i< array.length; i++){

                if (array[i] == number) {
                    counter++;
                } else array[i - counter]  = array[i];

        }

        int []array1 = new int [n-counter];
        for(int i=0; i<array1.length; i++){
            array1[i] = array[i];
        }
        System.out.println(Arrays.toString(array1));
        return array1;
    }
    public static void main(String[] args) {
        int []array = {4,5,2,8,9,1,5,8};
        int n = array.length;
        int number = 5;
        compare(array,number,n);

    }
}

