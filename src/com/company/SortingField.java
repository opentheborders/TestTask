/*
3.0. Двоичный поиск

Задача:

Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
Используйте перебор и двоичный поиск для решения этой задачи.
Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).
 */

package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingField {

    public static void brutForce(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("We found  " + array[i]);
            }
        }
    }
    public static  int binarySearch(int[] array, int number){
       int mid = array[array.length/2];
        int [] newArray = new int[(array.length/2)+1];
              if(mid == number) {
                  System.out.println(("We found  " + number));
              }
              if(number < mid){
                  for(int i=newArray[0]; i<newArray.length; i++){
                      newArray[i] = array[i];
                  }
                  return binarySearch(newArray, number);
              }
              if (number > mid){
                  for(int i=newArray[0]; i< newArray.length; i++) {
                      newArray[i] = array[(array.length/2)]++;
                  }
                  return binarySearch(newArray, number);
              }
        System.out.println(Arrays.toString(newArray));
        return 0;
    }

    public static void main(String[] args) {
    int number = 5678097;
    int []array = new int[10000000];
    for (int i = 1; i<array.length; i++){
        array[i] = i;
    }
     long startTime = System.currentTimeMillis();
  brutForce(array,number);
     long endTime = System.currentTimeMillis();
        System.out.println("Total time  " + (endTime-startTime));

       long startTime1 = System.currentTimeMillis();
   binarySearch(array, number);
        long endTime1 = System.currentTimeMillis();
       System.out.println("Total time  " + (endTime1-startTime1));
    }
}
