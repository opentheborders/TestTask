package com.company;

public class BinarySearch implements Searchable{

    int middle;
    int first;
    int last;
    @Override
    public void search(int number, int[] array) {

        if(array[middle] == number){
            System.out.println("Binary search -> \n We found " + number);
        } else

        if(number < middle) {
            first = array[0];
            last = array[middle-1];
            middle = array[last - first];
            search(number, array);
        } else

        if(number > middle){
            first = array[middle+1];
            last = array[array.length-1];
            middle = array[(last + first)/2];
            search(number, array);
        }

    }


}
