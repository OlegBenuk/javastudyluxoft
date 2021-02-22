package com.luxoft.jva001p1.basics.part3.xtasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class T1_Sort {
    public static void main(String[] args) throws Exception {
        int[] numbers = getArrOfRandomInts(10_000);

        int[] copyToSort = Arrays.copyOf(numbers, numbers.length);

        long startTime = System.currentTimeMillis();

        sortAsc(copyToSort);

        long endTime = System.currentTimeMillis();

        System.out.println("-->" + (endTime - startTime));

        int[] copyToCheck = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(copyToCheck);
        System.out.println("Is numbers sorted: "
                + String.valueOf(Arrays.equals(copyToCheck, copyToSort)).toUpperCase());
    }

    private static int[] getArrOfRandomInts(int count) {
        int[] numbers = new int[count];

        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(1000);
        }
        return numbers;
    }

    /**
     * Method should sort data array ascending order.
     * inner arr of diff types
     * automatic initialization of inner arrays
     */
    public static void sortAsc(int[] data) {
        System.out.println(Arrays.toString(data));

        int swaps;
        for (int i = 0; i < data.length; i++) {
            swaps = 0;
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    swaps++;
                    swap(data, j, j + 1);
                }
            }
            if (swaps == 0) return;
        }

        System.out.println(Arrays.toString(data));
    }


    /**
     * Method should exchange values with idx1 and idx2 in data array.
     */
    public static void swap(int[] data, int idx1, int idx2) {
        int temp = data[idx1];
        data[idx1] = data[idx2];
        data[idx2] = temp;
    }
}
