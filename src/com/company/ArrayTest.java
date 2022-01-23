package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayTest {
    List<Integer> listOfUnsorted = new LinkedList<>();
    List<Integer> listOfSorted = new LinkedList<>();
    List<Integer> listOfFirstHalfSorted = new LinkedList<>();
    List<Integer> listOfLastHalfSorted = new LinkedList<>();
    List<Integer> listOfPartiallySorted = new LinkedList<>();

    final int INIT_SIZE = 0;
    final int TIMES_TO_REPEAT = 2;
    final int STEP_SIZE = 10_000_000;
    final int MAX_SIZE = 100_000_000;

    public double middle(List<Integer> list) {
        return list.stream().mapToInt(s -> s).average().getAsDouble();
    }

    public void testForSearch(String fileName) throws IOException {

        FileWriter output = new FileWriter(fileName + ".txt");
//        output.write("Number   Unsorted   Sorted FirstHalfSorted LastHalfSorted PartiallySorted\n");


        for (int size = INIT_SIZE; size <= MAX_SIZE; size += STEP_SIZE) {
            ArrayData arrayData = new ArrayData(size);

            listOfUnsorted.clear();
            listOfSorted.clear();
            listOfFirstHalfSorted.clear();
            listOfLastHalfSorted.clear();
            listOfPartiallySorted.clear();

            for (int i = 0; i < TIMES_TO_REPEAT; i++) {
                arrayData.fillRandomData(100);
                int timeUnsorted = arrayData.search();
                listOfUnsorted.add(timeUnsorted);

                arrayData.fillSortedData();
                int timeSorted = arrayData.search();
                listOfSorted.add(timeSorted);

                arrayData.fillFirstHalfSortedData(100);
                int timeFirstHalfSorted = arrayData.search();
                listOfFirstHalfSorted.add(timeFirstHalfSorted);

                arrayData.fillLastHalfSortedData(100);
                int timeLastHalfSorted = arrayData.search();
                listOfLastHalfSorted.add(timeLastHalfSorted);

                arrayData.fillPartiallySortedData(100);
                int timePartiallySorted = arrayData.search();
                listOfPartiallySorted.add(timePartiallySorted);

//                System.out.print(i + ". Unsorted = " + timeUnsorted);
//                System.out.print(" Sorted = " + timeSorted);
//                System.out.print(" FirstHalfSorted = " + timeFirstHalfSorted);
//                System.out.print(" LastHalfSorted = " + timeLastHalfSorted);
//                System.out.println(" PartiallySorted = " + timePartiallySorted);

            }
            output.write(size + "   " + middle(listOfUnsorted) + "   " + middle(listOfSorted) + "   " + middle(listOfFirstHalfSorted) +
                    "   " + middle(listOfLastHalfSorted) + "   " + middle(listOfPartiallySorted) + "\n");
            System.out.print("Size = " + size);
            System.out.print(" UnSorted average = " + middle(listOfUnsorted));
            System.out.print(" Sorted average = " + middle(listOfSorted));
            System.out.print(" FirstHalfSorted average = " + middle(listOfFirstHalfSorted));
            System.out.print(" LastHalfSorted average = " + middle(listOfLastHalfSorted));
            System.out.println(" PartiallySorted average = " + middle(listOfPartiallySorted));

        }
        output.close();
    }


    public void testForSort(String fileName) throws IOException {

        FileWriter output = new FileWriter(fileName + ".txt");
//        output.write("Number   Unsorted   Sorted FirstHalfSorted LastHalfSorted PartiallySorted\n");


        for (int size = INIT_SIZE; size <= MAX_SIZE; size += STEP_SIZE) {
            ArrayData arrayData = new ArrayData(size);

            listOfUnsorted.clear();
            listOfSorted.clear();
            listOfFirstHalfSorted.clear();
            listOfLastHalfSorted.clear();
            listOfPartiallySorted.clear();

            for (int i = 0; i < TIMES_TO_REPEAT; i++) {
                arrayData.fillRandomData(100);
                int timeUnsorted = arrayData.sort();
                listOfUnsorted.add(timeUnsorted);

                arrayData.fillSortedData();
                int timeSorted = arrayData.sort();
                listOfSorted.add(timeSorted);

                arrayData.fillFirstHalfSortedData(100);
                int timeFirstHalfSorted = arrayData.sort();
                listOfFirstHalfSorted.add(timeFirstHalfSorted);

                arrayData.fillLastHalfSortedData(100);
                int timeLastHalfSorted = arrayData.sort();
                listOfLastHalfSorted.add(timeLastHalfSorted);

                arrayData.fillPartiallySortedData(100);
                int timePartiallySorted = arrayData.sort();
                listOfPartiallySorted.add(timePartiallySorted);

//                System.out.print(i + ". Unsorted = " + timeUnsorted);
//                System.out.print(" Sorted = " + timeSorted);
//                System.out.print(" FirstHalfSorted = " + timeFirstHalfSorted);
//                System.out.print(" LastHalfSorted = " + timeLastHalfSorted);
//                System.out.println(" PartiallySorted = " + timePartiallySorted);

            }
            output.write(size + "   " + middle(listOfUnsorted) + "   " + middle(listOfSorted) + "   " + middle(listOfFirstHalfSorted) +
                    "   " + middle(listOfLastHalfSorted) + "   " + middle(listOfPartiallySorted) + "\n");
            System.out.print("Size = " + size);
            System.out.print(" UnSorted average = " + middle(listOfUnsorted));
            System.out.print(" Sorted average = " + middle(listOfSorted));
            System.out.print(" FirstHalfSorted average = " + middle(listOfFirstHalfSorted));
            System.out.print(" LastHalfSorted average = " + middle(listOfLastHalfSorted));
            System.out.println(" PartiallySorted average = " + middle(listOfPartiallySorted));

        }
        output.close();
    }


    public void testForIf(String fileName) throws IOException {

        FileWriter output = new FileWriter(fileName + ".txt");
//        output.write("Number   Unsorted   Sorted FirstHalfSorted LastHalfSorted PartiallySorted\n");


        for (int size = INIT_SIZE; size <= MAX_SIZE; size += STEP_SIZE) {
            ArrayData arrayData = new ArrayData(size);

            listOfUnsorted.clear();
            listOfSorted.clear();
            listOfFirstHalfSorted.clear();
            listOfLastHalfSorted.clear();
            listOfPartiallySorted.clear();

            for (int i = 0; i < TIMES_TO_REPEAT; i++) {
                arrayData.fillRandomData(100);
                int timeUnsorted = arrayData.sum();
                listOfUnsorted.add(timeUnsorted);

                arrayData.fillSortedData();
                int timeSorted = arrayData.sum();
                listOfSorted.add(timeSorted);

                arrayData.fillFirstHalfSortedData(100);
                int timeFirstHalfSorted = arrayData.sum();
                listOfFirstHalfSorted.add(timeFirstHalfSorted);

                arrayData.fillLastHalfSortedData(100);
                int timeLastHalfSorted = arrayData.sum();
                listOfLastHalfSorted.add(timeLastHalfSorted);

                arrayData.fillPartiallySortedData(100);
                int timePartiallySorted = arrayData.sum();
                listOfPartiallySorted.add(timePartiallySorted);

//                System.out.print(i + ". Unsorted = " + timeUnsorted);
//                System.out.print(" Sorted = " + timeSorted);
//                System.out.print(" FirstHalfSorted = " + timeFirstHalfSorted);
//                System.out.print(" LastHalfSorted = " + timeLastHalfSorted);
//                System.out.println(" PartiallySorted = " + timePartiallySorted);

            }
            output.write(size + "   " + middle(listOfUnsorted) + "   " + middle(listOfSorted) + "   " + middle(listOfFirstHalfSorted) +
                    "   " + middle(listOfLastHalfSorted) + "   " + middle(listOfPartiallySorted) + "\n");
            System.out.print("Size = " + size);
            System.out.print(" UnSorted average = " + middle(listOfUnsorted));
            System.out.print(" Sorted average = " + middle(listOfSorted));
            System.out.print(" FirstHalfSorted average = " + middle(listOfFirstHalfSorted));
            System.out.print(" LastHalfSorted average = " + middle(listOfLastHalfSorted));
            System.out.println(" PartiallySorted average = " + middle(listOfPartiallySorted));

        }
        output.close();
    }
}