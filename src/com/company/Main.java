package com.company;

import java.util.Arrays;

public class Main {

    public static void brutForce(int[] array, int number) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Brut Force -> \n We found " + array[i]);
            }
        }
    }
    private static int binarySearch(int[] array, int number, int mid, int first, int last) {

        if(array[mid] == number){
            System.out.println("Binary search -> \n We found " + number);
        }
        if(number < mid) {
            first = array[0];
            last = array[mid-1];
            mid = array[last - first];
            return binarySearch(array,number,mid,first,last);

        }

        if(number > mid){
            first = array[mid+1];
            last = array[array.length-1];
            mid = array[(last + first)/2];
            return binarySearch(array,number,mid,first,last);
        }
        return -1;

    }
    public static void main(String[] args) {

        int number = 9980;
        int []array = new int[10000];
        for (int i = 1; i<array.length; i++){
            array[i] = i;
        }

        int middle = (array.length)/2;
        int first = 0;
        int last=0;

        long startTime = System.currentTimeMillis();
        brutForce(array,number);
        long endTime = System.currentTimeMillis();
        System.out.println("Total time  " + (endTime-startTime) + " \n");

        long startTime1 = System.currentTimeMillis();
        binarySearch(array, number, middle, first, last);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Total time  " + (endTime1-startTime1));
    }
}
