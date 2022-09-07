package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Welcome, engineer Ayman Mohamed");
        System.out.print("1\\ calculator \n" +
                "  2\\ Statistics metrics \n" +
                "   chose what you need : ");
        choice = scanner.nextInt();
        while (choice > 2 || choice < 1) {
            System.out.print("You can't fool me, chose what you need :");
            choice = scanner.nextInt();
        }
        switch (choice) {
            case 1:
                Calculator.showOperation();
                break;
            case 2:
                StatisticsMetrics.showOperation();
        }



    }
}
