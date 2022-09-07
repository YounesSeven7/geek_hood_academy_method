package com.company;

import java.util.Scanner;

public class StatisticsMetrics {
    static int operation;
    static Scanner scanner;
    static int[] array;
    static void showOperation() {
        scanner = new Scanner(System.in);
        readArray();
        System.out.print("1\\ Arithmetic mean" +
                "   2\\Repetition" +
                "    3\\standard deviation" +
                " \n chose operation:");
        operation = scanner.nextInt();
        while (operation > 3 || operation < 1) {
            System.out.print("You can't fool me, chose what you need :");
            operation = scanner.nextInt();
        }
        switch (operation) {
            case 1:
                System.out.println("the arithmeticMean is: " + arithmeticMean());
                break;
            case 2:
                System.out.println("the repetition is: " + repetition());
                break;
            case 3:
                System.out.println("the standard deviation is: " + standardDeviation());
                break;
        }
    }

    static void readArray() {
        System.out.print("enter size of array : ");
        int size = scanner.nextInt();
        array = new int[size];
        System.out.println("now you need to enter elements");
        for (int i = 0; i < size; i++) {
            System.out.print("number" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
    }

    static double arithmeticMean() {
        double mean = 0;
        for (int i = 0; i < array.length; i++) {
            mean = mean + array[i];
        }
        mean = mean / array.length;
        return mean;
    }

    static int repetition() {
        int max = 0, newMax = 0, numberOfMax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (i == 0) {
                        numberOfMax = array[i];
                        max++;
                    } else {
                        newMax++;
                    }
                }
            }
            if (max < newMax) {
                numberOfMax = array[i];
                max = newMax;
            }
        }
        return numberOfMax;
    }

    static double standardDeviation() {
        double mean = arithmeticMean();
        // sd --> standardDeviation , d -->The deviation of the number from the mean
        double sd = 0, d = 0;
        for (int i = 0; i < array.length; i++) {
            d =  Math.pow((array[i] - mean), 2);
            sd = sd + d;
        }
        sd = sd / array.length;
        sd = Math.sqrt(sd);

        return sd;
    }
}
