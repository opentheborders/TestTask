package com.company;

public class BrutForce implements Searchable {
    @Override
    public void search(int number, int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Brut Force -> \n We found " + array[i]);
            }
        }

    }
}
