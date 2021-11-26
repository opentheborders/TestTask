package com.company;

import java.util.Arrays;
import java.util.OptionalDouble;

public class ArrayUpdate {

    ArrayUpdate(double []array){
            fill(array);
            filter(array);
      }

      public static double[] fill(double [] array){
          for (int i = 0; i < array.length; i++) {
                 array[i] =  Math.random();
          }
          return array;
      }

      public static void filter(double []array) {

          double max = Arrays.stream(array)
                .reduce((a, b) -> Math.max(a, b))
                .getAsDouble();
          double min = Arrays.stream(array)
                .reduce((a, b) -> Math.min(a, b))
                .getAsDouble();

        OptionalDouble avg = Arrays.stream(array).average();
        System.out.println(max + "\n" + min + "\n" + avg);
    }

}
