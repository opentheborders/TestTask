package com.company;

import java.util.Arrays;
import java.util.OptionalDouble;
/*
1.1. Реализуйте алгоритм сортировки пузырьком для сортировки массива
 */

public class Algorithm {

     static void sort(int[] array) {

         for(int i = array.length-1 ; i > 0 ; i--){

             for(int j = 0 ; j < i ; j++){
                if( array[j] > array[j+1] ){
                int tmp = array[j];
                array[j] = array[j+1];
                array[j+1] = tmp;
            }
            }}
            }
                public static void main(String[] args) {

                    int [] array = {5,4,8,7,9,3};
                    sort(array);
                    System.out.println(Arrays.toString(array));
                }}