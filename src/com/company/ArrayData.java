package com.company;

import java.util.Arrays;
import java.util.Random;

public class ArrayData {
    public int[] array;

    public ArrayData(int size) {
        array = new int[size];
    }

    public void fillRandomData(int maxValue) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt() % maxValue;
    }

    public void fillSortedData() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = i;
    }

    public void fillFirstHalfSortedData(int maxValue) {
        Random random = new Random();
        int i;
        for (i = 0; i < array.length / 2; i++)
            array[i] = i;
        for (; i < array.length; i++)
            array[i] = random.nextInt() % maxValue;
    }

    public void fillLastHalfSortedData(int maxValue) {
        Random random = new Random();
        int i;
        for (i = 0; i < array.length / 2; i++)
            array[i] = random.nextInt() % maxValue;
        for (; i < array.length; i++)
            array[i] = i;
    }

    public void fillPartiallySortedData(int maxValue) {
        final int PARTS_AMOUNT = 10;
        Random random = new Random();
        int i = 0;
        for (int partNumber = 0; partNumber < PARTS_AMOUNT; partNumber++) {
            for (; i < array.length / (2 * PARTS_AMOUNT); i++)
                array[i] = i;
            for (; i < array.length / (2 * PARTS_AMOUNT); i++)
                array[i] = random.nextInt() % maxValue;
        }
    }

    public void printArray() {
        for (int data : array)
            System.out.print(data + " ");
        System.out.println();
    }

    public int sum() {
        long result = 0;
        long endTime, startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++)
            result += array[i] > 0 ? array[i] : 0;
        endTime = System.currentTimeMillis();
        return (int) (endTime - startTime);
    }

    public int sort() {
        long endTime, startTime = System.currentTimeMillis();
        Arrays.sort(array);
        endTime = System.currentTimeMillis();
        return (int) (endTime - startTime);
    }

    public int search() {
        int timesRepeated = 0;
        long endTime, startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++)
            if (array[i] == 0)
                timesRepeated++;
        endTime = System.currentTimeMillis();
        return (int) (endTime - startTime);
    }
}
