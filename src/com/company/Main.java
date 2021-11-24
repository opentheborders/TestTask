package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void random(int v[], int w[]){
        int n = IntStream.of(w).sum();
        int array[] = new int[n];
        int iterator = 0;
        for(int i = 0; i<w.length; i++){
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
